package io.usoamic.app.controllers

import io.usoamic.app.AppUrl
import io.usoamic.app.models.network.UserEntity
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*
import java.util.*
import javax.validation.Valid

@RestController
@RequestMapping(value = ["${AppUrl.APIv1}/users"], produces = [MediaType.APPLICATION_JSON_VALUE])
class UsersController {
    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    fun getUsers(): List<UserEntity> {
        return listOf(
            UserEntity(
                userId = UUID.randomUUID(),
                privateKey = "2",
                phone = "3"
            ),
            UserEntity(
                userId = UUID.randomUUID(),
                privateKey = "2",
                phone = "3"
            )
        )
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    fun addUsers(@Valid @RequestBody user: UserEntity) {

    }

    companion object {
        const val URL = "/"
    }
}