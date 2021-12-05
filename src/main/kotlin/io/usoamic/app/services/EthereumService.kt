package io.usoamic.app.services

import io.usoamic.commons.crossplatform.repositories.api.EthereumRepository
import org.springframework.stereotype.Service
import java.math.BigDecimal
import java.math.BigInteger

@Service
class EthereumService(
    private val ethereumRepository: EthereumRepository
) {
    val ethHeight: BigInteger
        get() {
        return ethereumRepository.ethHeight
            .blockingGet()
    }

    fun getBalance(address: String): BigDecimal {
        return ethereumRepository.getBalance(address)
            .blockingGet()
    }
}