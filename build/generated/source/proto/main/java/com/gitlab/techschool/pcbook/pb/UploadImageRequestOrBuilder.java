// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: laptop_service.proto

package com.gitlab.techschool.pcbook.pb;

public interface UploadImageRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:techschool.pcbook.UploadImageRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.techschool.pcbook.ImageInfo info = 1;</code>
   * @return Whether the info field is set.
   */
  boolean hasInfo();
  /**
   * <code>.techschool.pcbook.ImageInfo info = 1;</code>
   * @return The info.
   */
  com.gitlab.techschool.pcbook.pb.ImageInfo getInfo();
  /**
   * <code>.techschool.pcbook.ImageInfo info = 1;</code>
   */
  com.gitlab.techschool.pcbook.pb.ImageInfoOrBuilder getInfoOrBuilder();

  /**
   * <code>bytes chunk_data = 2;</code>
   * @return Whether the chunkData field is set.
   */
  boolean hasChunkData();
  /**
   * <code>bytes chunk_data = 2;</code>
   * @return The chunkData.
   */
  com.google.protobuf.ByteString getChunkData();

  public com.gitlab.techschool.pcbook.pb.UploadImageRequest.DataCase getDataCase();
}