package io.usoamic.app.mappers

import io.usoamic.app.dto.service.AccountTransactionDto
import io.usoamic.app.dto.service.TransactionDto
import io.usoamic.app.dto.service.TransactionTypeDto
import io.usoamic.app.mappers.base.CoinMapper
import io.usoamic.app.mappers.base.DateMapper
import io.usoamic.commons.crossplatform.models.repository.history.TransactionEntity
import io.usoamic.commons.crossplatform.models.repository.history.TransactionTypeEntity
import io.usoamic.usoamickt.model.Transaction
import org.mapstruct.Mapper
import org.mapstruct.Mapping
import org.mapstruct.Mappings

@Mapper(
    componentModel = "spring",
    uses = [CoinMapper::class, DateMapper::class]
)
interface TokenMapper {
    @Mappings(
        Mapping(target = "value", qualifiedByName = ["coinToBigDecimal"]),
        Mapping(target = "timestamp", qualifiedByName = ["timestampToDateTime"])
    )
    fun transactionEntityToDto(
        entity: TransactionEntity
    ): TransactionDto

    @Mappings(
        Mapping(target = "value", qualifiedByName = ["coinToBigDecimal"]),
        Mapping(target = "timestamp", qualifiedByName = ["timestampToDateTime"])
    )
    fun transactionToDto(
        transaction: Transaction
    ): AccountTransactionDto

    fun transactionTypeEntity(
        entity: TransactionTypeEntity
    ): TransactionTypeDto
}