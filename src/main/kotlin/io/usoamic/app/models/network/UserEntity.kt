package io.usoamic.app.models.network

import java.util.*

data class UserEntity(
    val userId: UUID,
    val privateKey: String,
    val phone: String
)