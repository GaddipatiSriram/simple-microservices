package com.User.UserCreate.Server;

        import com.proto.app1.UserCreate;
        import com.proto.app1.UserCreateRequest;
        import com.proto.app1.UserCreateResponse;
        import com.proto.app1.UserServiceGrpc;
        import io.grpc.stub.StreamObserver;

public class UserCreateImpl extends UserServiceGrpc.UserServiceImplBase {
    @Override
    public void userCreate(UserCreateRequest request, StreamObserver<UserCreateResponse> responseObserver) {

        UserCreate user = request.getUser();
        String first_name = user.getFirstName();
        String last_name = user.getLastName();

        String result = "User Id for User:" + first_name + last_name + "is:  1";

        UserCreateResponse response = UserCreateResponse.newBuilder()
                .setUserId(result)
                .build();

        responseObserver.onNext(response);
        //super.userCreate(request, responseObserver);

        responseObserver.onCompleted();
    }
}
