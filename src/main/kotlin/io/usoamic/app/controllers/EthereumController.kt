package io.usoamic.app.controllers

import io.usoamic.app.api.EthereumApi
import io.usoamic.app.services.EthereumService
import org.springframework.web.bind.annotation.RestController
import java.math.BigDecimal
import java.math.BigInteger

@RestController
class EthereumController(
    private val ethereumService: EthereumService
) : EthereumApi {
    override fun getEthHeight(): BigInteger {
        return ethereumService.ethHeight
    }

    override fun getBalance(address: String): BigDecimal {
        return ethereumService.getBalance(address)
    }
}