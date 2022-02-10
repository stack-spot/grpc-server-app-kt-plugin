package {{project_group_id}}.endpoint

import com.google.protobuf.Empty
import {{project_group_id}}.GetUserResponse
import {{project_group_id}}.UserEndpointGrpc
import {{project_group_id}}.service.UserService
import io.grpc.stub.StreamObserver
import org.lognet.springboot.grpc.GRpcService

@GRpcService
class UserEndpoint(private val userService: UserService) : UserEndpointGrpc.UserEndpointImplBase() {

    override fun getUsers(request: Empty?, responseObserver: StreamObserver<GetUserResponse>) {
        responseObserver.onNext(userService.getUsers())
        responseObserver.onCompleted()
    }
}
