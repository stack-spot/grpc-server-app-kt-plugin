package {{project_group_id}}.service

import {{project_group_id}}.GetUserResponse
import {{project_group_id}}.UserResponse
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class UserService {

    fun getUsers(): GetUserResponse = GetUserResponse.newBuilder().addAllUserResponseList(
        listOf(UserResponse.newBuilder().setId(UUID.randomUUID().toString()).setName("Test").build())
    ).build()
}
