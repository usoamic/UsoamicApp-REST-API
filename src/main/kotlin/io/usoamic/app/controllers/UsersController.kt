package io.usoamic.app.controllers

import io.usoamic.app.api.UsersApi
import io.usoamic.app.mappers.UserMapper
import io.usoamic.app.models.network.request.AddUserRequest
import io.usoamic.app.models.network.response.UserDtoEntity
import io.usoamic.app.services.UserService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import javax.inject.Inject
import javax.validation.Valid

@RestController
class UsersController @Inject constructor(
    private val userService: UserService,
    private val userMapper: UserMapper
) : UsersApi {
    override fun getUsers(): ResponseEntity<List<UserDtoEntity>> {
        val list = userService.getUsers()
            .map(userMapper::modelToDto)
        return ResponseEntity.ok(list)

    }

    override fun addUsers(@Valid @RequestBody addUserEntity: AddUserRequest) {
        val model = userMapper.addUserRequestToModel(addUserEntity)
        userService.addUsers(model)
    }
}