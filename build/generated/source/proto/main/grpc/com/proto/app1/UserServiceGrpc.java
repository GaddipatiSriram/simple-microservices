package com.proto.app1;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.27.2)",
    comments = "Source: app1/User.proto")
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final String SERVICE_NAME = "app1.UserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.app1.UserCreateRequest,
      com.proto.app1.UserCreateResponse> getUserCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UserCreate",
      requestType = com.proto.app1.UserCreateRequest.class,
      responseType = com.proto.app1.UserCreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.app1.UserCreateRequest,
      com.proto.app1.UserCreateResponse> getUserCreateMethod() {
    io.grpc.MethodDescriptor<com.proto.app1.UserCreateRequest, com.proto.app1.UserCreateResponse> getUserCreateMethod;
    if ((getUserCreateMethod = UserServiceGrpc.getUserCreateMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getUserCreateMethod = UserServiceGrpc.getUserCreateMethod) == null) {
          UserServiceGrpc.getUserCreateMethod = getUserCreateMethod =
              io.grpc.MethodDescriptor.<com.proto.app1.UserCreateRequest, com.proto.app1.UserCreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UserCreate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.app1.UserCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.app1.UserCreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("UserCreate"))
              .build();
        }
      }
    }
    return getUserCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.app1.UserInfoRequest,
      com.proto.app1.UserInfoResponse> getUserInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UserInfo",
      requestType = com.proto.app1.UserInfoRequest.class,
      responseType = com.proto.app1.UserInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.app1.UserInfoRequest,
      com.proto.app1.UserInfoResponse> getUserInfoMethod() {
    io.grpc.MethodDescriptor<com.proto.app1.UserInfoRequest, com.proto.app1.UserInfoResponse> getUserInfoMethod;
    if ((getUserInfoMethod = UserServiceGrpc.getUserInfoMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getUserInfoMethod = UserServiceGrpc.getUserInfoMethod) == null) {
          UserServiceGrpc.getUserInfoMethod = getUserInfoMethod =
              io.grpc.MethodDescriptor.<com.proto.app1.UserInfoRequest, com.proto.app1.UserInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UserInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.app1.UserInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.app1.UserInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("UserInfo"))
              .build();
        }
      }
    }
    return getUserInfoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceStub>() {
        @java.lang.Override
        public UserServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceStub(channel, callOptions);
        }
      };
    return UserServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub>() {
        @java.lang.Override
        public UserServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceBlockingStub(channel, callOptions);
        }
      };
    return UserServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub>() {
        @java.lang.Override
        public UserServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceFutureStub(channel, callOptions);
        }
      };
    return UserServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class UserServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void userCreate(com.proto.app1.UserCreateRequest request,
        io.grpc.stub.StreamObserver<com.proto.app1.UserCreateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUserCreateMethod(), responseObserver);
    }

    /**
     */
    public void userInfo(com.proto.app1.UserInfoRequest request,
        io.grpc.stub.StreamObserver<com.proto.app1.UserInfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUserInfoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUserCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.app1.UserCreateRequest,
                com.proto.app1.UserCreateResponse>(
                  this, METHODID_USER_CREATE)))
          .addMethod(
            getUserInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.app1.UserInfoRequest,
                com.proto.app1.UserInfoResponse>(
                  this, METHODID_USER_INFO)))
          .build();
    }
  }

  /**
   */
  public static final class UserServiceStub extends io.grpc.stub.AbstractAsyncStub<UserServiceStub> {
    private UserServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     */
    public void userCreate(com.proto.app1.UserCreateRequest request,
        io.grpc.stub.StreamObserver<com.proto.app1.UserCreateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUserCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void userInfo(com.proto.app1.UserInfoRequest request,
        io.grpc.stub.StreamObserver<com.proto.app1.UserInfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUserInfoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.app1.UserCreateResponse userCreate(com.proto.app1.UserCreateRequest request) {
      return blockingUnaryCall(
          getChannel(), getUserCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.app1.UserInfoResponse userInfo(com.proto.app1.UserInfoRequest request) {
      return blockingUnaryCall(
          getChannel(), getUserInfoMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserServiceFutureStub extends io.grpc.stub.AbstractFutureStub<UserServiceFutureStub> {
    private UserServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.app1.UserCreateResponse> userCreate(
        com.proto.app1.UserCreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUserCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.app1.UserInfoResponse> userInfo(
        com.proto.app1.UserInfoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUserInfoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_USER_CREATE = 0;
  private static final int METHODID_USER_INFO = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_USER_CREATE:
          serviceImpl.userCreate((com.proto.app1.UserCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.app1.UserCreateResponse>) responseObserver);
          break;
        case METHODID_USER_INFO:
          serviceImpl.userInfo((com.proto.app1.UserInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.app1.UserInfoResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.app1.App1.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserService");
    }
  }

  private static final class UserServiceFileDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier {
    UserServiceFileDescriptorSupplier() {}
  }

  private static final class UserServiceMethodDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (UserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceFileDescriptorSupplier())
              .addMethod(getUserCreateMethod())
              .addMethod(getUserInfoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
