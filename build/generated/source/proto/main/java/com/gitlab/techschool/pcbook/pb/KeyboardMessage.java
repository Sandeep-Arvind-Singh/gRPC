// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: keyboard_message.proto

package com.gitlab.techschool.pcbook.pb;

public final class KeyboardMessage {
  private KeyboardMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_techschool_pcbook_Keyboard_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_techschool_pcbook_Keyboard_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026keyboard_message.proto\022\021techschool.pcb" +
      "ook\"\212\001\n\010Keyboard\0222\n\006layout\030\001 \001(\0162\".techs" +
      "chool.pcbook.Keyboard.Layout\022\017\n\007backlit\030" +
      "\002 \001(\010\"9\n\006Layout\022\013\n\007UNKNOWN\020\000\022\n\n\006QWERTY\020\001" +
      "\022\n\n\006QWERTZ\020\002\022\n\n\006AZERTY\020\003B\'\n\037com.gitlab.t" +
      "echschool.pcbook.pbP\001Z\002pbb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_techschool_pcbook_Keyboard_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_techschool_pcbook_Keyboard_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_techschool_pcbook_Keyboard_descriptor,
        new java.lang.String[] { "Layout", "Backlit", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}