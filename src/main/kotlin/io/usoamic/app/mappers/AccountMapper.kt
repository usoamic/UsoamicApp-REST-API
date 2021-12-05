package io.usoamic.app.mappers

import io.usoamic.app.dto.service.AccountCredentialsDto
import io.usoamic.app.dto.service.AddAccountDto
import io.usoamic.commons.crossplatform.models.repository.add.AddAccountEntity
import io.usoamic.commons.crossplatform.models.repository.ethereum.AccountCredentialsEntity
import org.mapstruct.Mapper
import org.mapstruct.ReportingPolicy

@Mapper(
    componentModel = "spring",
    unmappedTargetPolicy = ReportingPolicy.IGNORE
)
interface AccountMapper {
    fun addAccountEntityToDto(
        entity: AddAccountEntity
    ): AddAccountDto

    fun accountCredentialsEntityToDto(
        entity: AccountCredentialsEntity
    ): AccountCredentialsDto
}
