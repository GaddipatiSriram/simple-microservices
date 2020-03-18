package com.User.UserCreate.Client;

        import com.proto.app1.UserCreate;
        import com.proto.app1.UserCreateRequest;
        import com.proto.app1.UserCreateResponse;
        import com.proto.app1.UserServiceGrpc;
        import io.grpc.ManagedChannel;
        import io.grpc.ManagedChannelBuilder;


public class UserCreateClient {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        UserServiceGrpc.UserServiceBlockingStub UserCreateClient = UserServiceGrpc.newBlockingStub(channel);

        UserCreate userCreate = UserCreate.newBuilder()
                .setFirstName("John")
                .setLastName("Doe")
                .build();

        UserCreateRequest createRequest = UserCreateRequest.newBuilder()
                .setUser(userCreate)
                .build();

        UserCreateResponse createResponse =  UserCreateClient.userCreate(createRequest);
        System.out.println(createResponse);


        channel.shutdown();
    }
}
