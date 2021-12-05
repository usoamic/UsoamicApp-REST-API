package io.usoamic.app.dto.service

import java.math.BigDecimal
import java.math.BigInteger
import java.time.LocalDateTime

data class TransactionDto(
    val isExist: Boolean,
    val txId: BigInteger,
    val from: String,
    val to: String,
    val value: BigDecimal,
    val timestamp: LocalDateTime
)