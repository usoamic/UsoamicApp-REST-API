package io.usoamic.app.services

import io.usoamic.app.dto.service.NoteDto
import io.usoamic.app.mappers.NoteMapper
import io.usoamic.commons.crossplatform.repositories.api.EthereumRepository
import io.usoamic.commons.crossplatform.repositories.api.NotesRepository
import org.springframework.stereotype.Service
import java.math.BigInteger

@Service
class NotesService(
    private val notesRepository: NotesRepository,
    private val noteMapper: NoteMapper
) {
    fun getNote(
        refId: BigInteger
    ): NoteDto {
        return notesRepository.getNote(refId)
            .map(noteMapper::noteEntityToDto)
            .blockingGet()
    }

    fun getNoteByAddress(
        id: BigInteger,
        address: String
    ): NoteDto {
        return notesRepository.getNoteForAccount(
            id = id,
            address = address
        )
            .map(noteMapper::noteEntityToDto)
            .blockingGet()
    }
}