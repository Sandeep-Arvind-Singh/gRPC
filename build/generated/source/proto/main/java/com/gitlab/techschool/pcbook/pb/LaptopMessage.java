// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: laptop_message.proto

package com.gitlab.techschool.pcbook.pb;

public final class LaptopMessage {
  private LaptopMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_techschool_pcbook_Laptop_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_techschool_pcbook_Laptop_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024laptop_message.proto\022\021techschool.pcboo" +
      "k\032\027processor_message.proto\032\024memory_messa" +
      "ge.proto\032\025storage_message.proto\032\024screen_" +
      "message.proto\032\026keyboard_message.proto\032\037g" +
      "oogle/protobuf/timestamp.proto\"\271\003\n\006Lapto" +
      "p\022\n\n\002id\030\001 \001(\t\022\r\n\005brand\030\002 \001(\t\022\014\n\004name\030\003 \001" +
      "(\t\022#\n\003cpu\030\004 \001(\0132\026.techschool.pcbook.CPU\022" +
      "&\n\003ram\030\005 \001(\0132\031.techschool.pcbook.Memory\022" +
      "$\n\004gpus\030\006 \003(\0132\026.techschool.pcbook.GPU\022,\n" +
      "\010storages\030\007 \003(\0132\032.techschool.pcbook.Stor" +
      "age\022)\n\006screen\030\010 \001(\0132\031.techschool.pcbook." +
      "Screen\022-\n\010keyboard\030\t \001(\0132\033.techschool.pc" +
      "book.Keyboard\022\023\n\tweight_kg\030\n \001(\001H\000\022\023\n\twe" +
      "ight_lb\030\013 \001(\001H\000\022\021\n\tprice_usd\030\014 \001(\001\022\024\n\014re" +
      "lease_year\030\r \001(\r\022.\n\nupdated_at\030\016 \001(\0132\032.g" +
      "oogle.protobuf.TimestampB\010\n\006weightB\'\n\037co" +
      "m.gitlab.techschool.pcbook.pbP\001Z\002pbb\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gitlab.techschool.pcbook.pb.ProcessorMessage.getDescriptor(),
          com.gitlab.techschool.pcbook.pb.MemoryMessage.getDescriptor(),
          com.gitlab.techschool.pcbook.pb.StorageMessage.getDescriptor(),
          com.gitlab.techschool.pcbook.pb.ScreenMessage.getDescriptor(),
          com.gitlab.techschool.pcbook.pb.KeyboardMessage.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_techschool_pcbook_Laptop_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_techschool_pcbook_Laptop_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_techschool_pcbook_Laptop_descriptor,
        new java.lang.String[] { "Id", "Brand", "Name", "Cpu", "Ram", "Gpus", "Storages", "Screen", "Keyboard", "WeightKg", "WeightLb", "PriceUsd", "ReleaseYear", "UpdatedAt", "Weight", });
    com.gitlab.techschool.pcbook.pb.ProcessorMessage.getDescriptor();
    com.gitlab.techschool.pcbook.pb.MemoryMessage.getDescriptor();
    com.gitlab.techschool.pcbook.pb.StorageMessage.getDescriptor();
    com.gitlab.techschool.pcbook.pb.ScreenMessage.getDescriptor();
    com.gitlab.techschool.pcbook.pb.KeyboardMessage.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
