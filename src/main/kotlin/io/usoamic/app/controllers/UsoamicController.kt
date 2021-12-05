package io.usoamic.app.controllers

import io.usoamic.app.api.UsoamicApi
import io.usoamic.app.dto.service.AccountTransactionDto
import io.usoamic.app.dto.service.TransactionDto
import io.usoamic.app.services.TokenService
import org.springframework.web.bind.annotation.RestController
import java.math.BigDecimal
import java.math.BigInteger

@RestController
class UsoamicController(
    private val tokenService: TokenService
) : UsoamicApi {
    override fun getSupply(): BigDecimal {
        return tokenService.usoSupply
    }

    override fun getBalance(address: String): BigDecimal {
        return tokenService.getBalance(
            address = address
        )
    }

    override fun getTransactionByAddress(address: String, txId: BigInteger): TransactionDto {
        return tokenService.getTransactionByAddress(
            address = address,
            txId = txId
        )
    }

    override fun getTransaction(txId: BigInteger): AccountTransactionDto {
        return tokenService.getTransaction(
            txId = txId
        )
    }
}