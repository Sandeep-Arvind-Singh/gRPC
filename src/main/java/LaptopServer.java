import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.protobuf.services.ProtoReflectionService;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class LaptopServer {
    Server server;
    int port;
    public static final Logger logger = Logger.getLogger(LaptopService.class.getName());

    LaptopServer(int port, LaptopStore laptopStore)
    {
        this.port = port;
        LaptopService laptopService = new LaptopService(laptopStore);
        server = ServerBuilder.forPort(port).addService(laptopService)
                .addService(ProtoReflectionService.newInstance())
                .build();
    }

    public void start() throws IOException {
        server.start();
        logger.info("server started on port " + port);

        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                System.err.println("shut down gRPC server because JVM shuts down");
                try {
                    LaptopServer.this.stop();
                } catch (InterruptedException e) {
                    e.printStackTrace(System.err);
                }
                System.err.println("server shut down");
            }
        });
    }

    public void stop() throws InterruptedException {
        if (server != null) {
            server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
        }
    }

    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        InMemoryLaptopStore laptopStore = new InMemoryLaptopStore();
        LaptopServer server = new LaptopServer(8080, laptopStore);
        server.start();
        server.blockUntilShutdown();
    }
}
