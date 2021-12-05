package io.usoamic.app.api

import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import io.usoamic.app.AppUrl
import io.usoamic.app.dto.service.NoteDto
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import java.math.BigInteger

@Api(
    value = "Notes"
)
@RequestMapping(
    value = ["${AppUrl.APIv1}/notes"],
    produces = [MediaType.APPLICATION_JSON_VALUE]
)
interface NotesApi {
    @ApiOperation("Get ETH height")
    @GetMapping("/notes/{refId}")
    @ResponseStatus(code = HttpStatus.OK)
    fun getNote(
        refId: BigInteger
    ): NoteDto

    @ApiOperation("Get ETH height")
    @GetMapping("/addresses/{address}/notes/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    fun getNoteByAddress(
        id: BigInteger,
        address: String
    ): NoteDto
}