package io.usoamic.app.mappers

import io.usoamic.app.dto.service.NoteDto
import io.usoamic.app.mappers.base.CoinMapper
import io.usoamic.app.mappers.base.DateMapper
import io.usoamic.commons.crossplatform.models.repository.notes.NoteEntity
import org.mapstruct.Mapper
import org.mapstruct.Mapping
import org.mapstruct.Mappings
import org.mapstruct.ReportingPolicy

@Mapper(
    componentModel = "spring",
    uses = [DateMapper::class]
)
interface NoteMapper {
    @Mappings(
        Mapping(target = "timestamp", qualifiedByName = ["timestampToDateTime"])
    )
    fun noteEntityToDto(entity: NoteEntity): NoteDto
}