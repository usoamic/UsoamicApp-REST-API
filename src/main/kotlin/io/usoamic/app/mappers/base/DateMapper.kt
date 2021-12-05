package io.usoamic.app.mappers.base

import io.usoamic.usoamickt.util.Coin
import io.usoamic.usoamickt.util.Timestamp
import org.mapstruct.Mapper
import org.mapstruct.Named
import java.math.BigDecimal
import java.math.BigInteger
import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneId

@Mapper(componentModel = "spring")
abstract class DateMapper {
    @Named("timestampToDateTime")
    fun timestampToDateTime(timestamp: BigInteger): LocalDateTime {
        return LocalDateTime.ofInstant(
            Instant.ofEpochSecond(timestamp.toLong()),
            ZoneId.systemDefault()
        )
    }
}