package io.usoamic.app.controllers

import io.usoamic.app.api.NotesApi
import io.usoamic.app.dto.service.NoteDto
import io.usoamic.app.services.NotesService
import org.springframework.web.bind.annotation.RestController
import java.math.BigInteger

@RestController
class NotesController(
    private val notesService: NotesService
) : NotesApi {
    override fun getNote(refId: BigInteger): NoteDto {
        return notesService.getNote(
            refId = refId
        )
    }

    override fun getNoteByAddress(id: BigInteger, address: String): NoteDto {
        return notesService.getNoteByAddress(
            id = id,
            address = address
        )
    }

}