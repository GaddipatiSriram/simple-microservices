// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: app1/User.proto

package com.proto.app1;

public final class App1 {
  private App1() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_app1_UserCreate_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_app1_UserCreate_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_app1_UserCreateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_app1_UserCreateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_app1_UserCreateResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_app1_UserCreateResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_app1_UserInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_app1_UserInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_app1_UserInfoRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_app1_UserInfoRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_app1_UserInfoResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_app1_UserInfoResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017app1/User.proto\022\004app1\"3\n\nUserCreate\022\022\n" +
      "\nfirst_name\030\001 \001(\t\022\021\n\tlast_name\030\002 \001(\t\"3\n\021" +
      "UserCreateRequest\022\036\n\004user\030\001 \001(\0132\020.app1.U" +
      "serCreate\"%\n\022UserCreateResponse\022\017\n\007user_" +
      "id\030\001 \001(\t\"\033\n\010UserInfo\022\017\n\007user_id\030\001 \001(\t\"-\n" +
      "\017UserInfoRequest\022\032\n\002id\030\001 \001(\0132\016.app1.User" +
      "Info\"9\n\020UserInfoResponse\022\022\n\nfirst_name\030\001" +
      " \001(\t\022\021\n\tlast_name\030\002 \001(\t2\215\001\n\013UserService\022" +
      "A\n\nUserCreate\022\027.app1.UserCreateRequest\032\030" +
      ".app1.UserCreateResponse\"\000\022;\n\010UserInfo\022\025" +
      ".app1.UserInfoRequest\032\026.app1.UserInfoRes" +
      "ponse\"\000B\022\n\016com.proto.app1P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_app1_UserCreate_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_app1_UserCreate_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_app1_UserCreate_descriptor,
        new java.lang.String[] { "FirstName", "LastName", });
    internal_static_app1_UserCreateRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_app1_UserCreateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_app1_UserCreateRequest_descriptor,
        new java.lang.String[] { "User", });
    internal_static_app1_UserCreateResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_app1_UserCreateResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_app1_UserCreateResponse_descriptor,
        new java.lang.String[] { "UserId", });
    internal_static_app1_UserInfo_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_app1_UserInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_app1_UserInfo_descriptor,
        new java.lang.String[] { "UserId", });
    internal_static_app1_UserInfoRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_app1_UserInfoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_app1_UserInfoRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_app1_UserInfoResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_app1_UserInfoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_app1_UserInfoResponse_descriptor,
        new java.lang.String[] { "FirstName", "LastName", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
