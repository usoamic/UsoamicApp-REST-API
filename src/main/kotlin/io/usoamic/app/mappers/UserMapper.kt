package io.usoamic.app.mappers

import io.usoamic.app.models.data.AddUserModel
import io.usoamic.app.models.data.UserModel
import io.usoamic.app.models.db.UsersDbEntity
import io.usoamic.app.models.network.request.AddUserRequest
import io.usoamic.app.models.network.response.UserDtoEntity
import org.mapstruct.Mapper
import org.mapstruct.ReportingPolicy

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
interface UserMapper {
    /*
     * User
     */
    fun modelToDto(model: UserModel): UserDtoEntity
    fun dbToModel(db: UsersDbEntity): UserModel

    /*
     * AddUser
     */
    fun addUserRequestToModel(request: AddUserRequest): AddUserModel
    fun addUserModelToDb(model: AddUserModel): UsersDbEntity
}
