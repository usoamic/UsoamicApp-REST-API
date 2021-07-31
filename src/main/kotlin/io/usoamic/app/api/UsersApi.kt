package io.usoamic.app.api

import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import io.usoamic.app.AppUrl
import io.usoamic.app.models.network.request.AddUserRequest
import io.usoamic.app.models.network.response.UserDtoEntity
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@Api(value = "Users")
@RequestMapping(value = ["${AppUrl.APIv1}/users"], produces = [MediaType.APPLICATION_JSON_VALUE])
interface UsersApi {
    @ApiOperation("Get users")
    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    fun getUsers(): ResponseEntity<List<UserDtoEntity>>

    @ApiOperation("Add new user")
    @PostMapping
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    fun addUsers(@Valid @RequestBody addUserEntity: AddUserRequest)
}