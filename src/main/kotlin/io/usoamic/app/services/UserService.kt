package io.usoamic.app.services

import io.usoamic.app.mappers.UserMapper
import io.usoamic.app.models.data.AddUserModel
import io.usoamic.app.models.data.UserModel
import io.usoamic.app.repositories.UsersRepository
import org.springframework.stereotype.Service
import javax.inject.Inject

@Service
class UserService @Inject constructor(
    private val usersRepository: UsersRepository,
    private val userMapper: UserMapper/*,
    private val tokenRepository: TokenRepository*/
){
    fun getUsers(): List<UserModel> {
        return usersRepository.findAll()
            .map(userMapper::dbToModel)
            .toList()
    }

    fun addUsers(user: AddUserModel) {
        val model = userMapper.addUserModelToDb(user)
        usersRepository.save(model)
    }
}