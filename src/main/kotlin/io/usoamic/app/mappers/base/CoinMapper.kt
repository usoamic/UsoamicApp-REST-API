package io.usoamic.app.mappers.base

import io.usoamic.usoamickt.util.Coin
import org.mapstruct.Mapper
import org.mapstruct.Named
import java.math.BigDecimal

@Mapper(componentModel = "spring")
abstract class CoinMapper {
    @Named("coinToBigDecimal")
    fun coinToBigDecimal(coin: Coin): BigDecimal {
        return coin.toBigDecimal()
    }
}