package io.usoamic.app.dto.service

import io.usoamic.usoamickt.enumcls.NoteType
import java.math.BigInteger
import java.time.LocalDateTime

data class NoteDto(
    val noteId: BigInteger,
    val noteType: NoteType,
    val noteRefId: BigInteger,
    val content: String,
    val author: String,
    val timestamp: LocalDateTime,
    val isAuthor: Boolean
)

enum class NoteTypeDto {
    PUBLIC,
    UNLISTED
}