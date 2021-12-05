package io.usoamic.app.api

import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import io.usoamic.app.AppUrl
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import java.math.BigDecimal
import java.math.BigInteger

@Api(
    value = "Ethereum"
)
@RequestMapping(
    value = ["${AppUrl.APIv1}/ethereum"],
    produces = [MediaType.APPLICATION_JSON_VALUE]
)
interface EthereumApi {
    @ApiOperation("Get ETH height")
    @GetMapping("/height")
    @ResponseStatus(code = HttpStatus.OK)
    fun getEthHeight(): BigInteger

    @ApiOperation("Get ETH Balance")
    @GetMapping("/balance/{address}")
    @ResponseStatus(code = HttpStatus.OK)
    fun getBalance(@PathVariable address: String): BigDecimal
}