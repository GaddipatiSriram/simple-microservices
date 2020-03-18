package com.User.UserCreate.Server;

import io.grpc.Server;
        import io.grpc.ServerBuilder;
        import java.io.IOException;

public class UserCreateServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Hello GRPC");

        Server server = ServerBuilder.forPort(50051)
                .addService(new UserCreateImpl())
                .build();

        server.start();

        Runtime.getRuntime().addShutdownHook(new Thread( () -> {
            System.out.println("Received Shutdown Request");
            server.shutdown();
            System.out.println("Succcessfully stopped the server");
        }));
        server.awaitTermination();
    }
}