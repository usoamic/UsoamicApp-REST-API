package io.usoamic.app.services

import io.usoamic.app.dto.service.AccountCredentialsDto
import io.usoamic.app.dto.service.AddAccountDto
import io.usoamic.app.mappers.AccountMapper
import io.usoamic.commons.crossplatform.repositories.api.EthereumRepository
import io.usoamic.commons.crossplatform.repositories.api.UserRepository
import org.springframework.stereotype.Service

@Service
class AccountService(
    private val userRepository: UserRepository,
    private val ethereumRepository: EthereumRepository,
    private val accountMapper: AccountMapper
) {
    fun hasAccount(): Boolean {
        return userRepository.hasAccount()
            .blockingGet()
    }

    fun createCredentials(): AccountCredentialsDto {
        return ethereumRepository.createCredentials()
            .map(accountMapper::accountCredentialsEntityToDto)
            .blockingGet()
    }

    fun addAccount(
        password: String,
        privateKey: String
    ): AddAccountDto {
        return ethereumRepository.addAccount(
            privateKey = privateKey,
            password = password
        ).map(accountMapper::addAccountEntityToDto)
            .blockingGet()
    }
}