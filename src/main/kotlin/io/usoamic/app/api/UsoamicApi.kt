package io.usoamic.app.api

import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import io.usoamic.app.AppUrl
import io.usoamic.app.dto.service.AccountTransactionDto
import io.usoamic.app.dto.service.TransactionDto
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import java.math.BigDecimal
import java.math.BigInteger

@Api(
    value = "Usoamic"
)
@RequestMapping(
    value = ["${AppUrl.APIv1}/usoamic"],
    produces = [MediaType.APPLICATION_JSON_VALUE]
)
interface UsoamicApi {
    @ApiOperation("Usoamic supply")
    @GetMapping("/supply")
    @ResponseStatus(code = HttpStatus.OK)
    fun getSupply(): BigDecimal

    @ApiOperation("Usoamic Balance")
    @GetMapping("/addresses/{address}/balance")
    @ResponseStatus(code = HttpStatus.OK)
    fun getBalance(address: String): BigDecimal

    @ApiOperation("Get transaction by address")
    @GetMapping("/addresses/{address}/transaction/{txId}")
    @ResponseStatus(code = HttpStatus.OK)
    fun getTransactionByAddress(
        address: String,
        txId: BigInteger
    ): AccountTransactionDto

    @ApiOperation("Get transaction")
    @GetMapping("/transactions/{txId}")
    @ResponseStatus(code = HttpStatus.OK)
    fun getTransaction(
        txId: BigInteger
    ): TransactionDto
}