package io.usoamic.app.dto.service

import java.math.BigDecimal
import java.math.BigInteger
import java.time.LocalDateTime

data class AccountTransactionDto(
    val type: TransactionTypeDto,
    val txId: BigInteger,
    val from: String,
    val to: String,
    val value: BigDecimal,
    val date: LocalDateTime
)

enum class TransactionTypeDto {
    DEPOSIT,
    WITHDRAW
}