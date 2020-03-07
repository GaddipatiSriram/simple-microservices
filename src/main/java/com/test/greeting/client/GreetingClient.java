package com.test.greeting.client;

        import com.proto.dummy.Dummy;
        import com.proto.dummy.DummyServiceGrpc;
        import io.grpc.ManagedChannel;
        import io.grpc.ManagedChannelBuilder;


public class GreetingClient {
    public static void main(String[] args) {
        System.out.println("GRPC Client");

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        System.out.println("Creating Stub");
        DummyServiceGrpc.DummyServiceBlockingStub syncClient = DummyServiceGrpc.newBlockingStub(channel);

       // DummyServiceGrpc.DummyServiceBlockingStub asyncClient = DummyServiceGrpc.newFutureStub(channel)

        channel.shutdown();

        System.out.println("Shutting down Channel");

    }
}
