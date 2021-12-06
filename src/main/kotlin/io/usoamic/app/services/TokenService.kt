package io.usoamic.app.services

import io.usoamic.app.dto.service.AccountTransactionDto
import io.usoamic.app.dto.service.TransactionDto
import io.usoamic.app.mappers.TokenMapper
import io.usoamic.commons.crossplatform.repositories.api.EthereumRepository
import io.usoamic.commons.crossplatform.repositories.api.TokenRepository
import org.springframework.stereotype.Service
import java.math.BigDecimal
import java.math.BigInteger

@Service
class TokenService(
    private val tokenRepository: TokenRepository,
    private val tokenMapper: TokenMapper
) {
    val usoSupply: BigDecimal get() {
        return tokenRepository.usoSupply
            .blockingGet()
    }

    fun getBalance(address: String): BigDecimal {
        return tokenRepository.getBalance(address)
            .blockingGet()
    }

    fun getTransactionByAddress(
        address: String,
        txId: BigInteger
    ): AccountTransactionDto {
        return tokenRepository.getTransactionByAddress(
            owner = address,
            txId = txId
        )
            .map {
                it
            }
            .map(tokenMapper::transactionEntityToDto)
            .blockingGet()
    }

    fun getTransaction(
        txId: BigInteger
    ): TransactionDto {
        return tokenRepository.getTransaction(txId)
            .map(tokenMapper::transactionToDto)
            .blockingGet()
    }
}