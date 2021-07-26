package io.usoamic.app.models.network

import java.util.*

//import java.util.*

data class UserDtoEntity(
    val userId: UUID,
    val privateKey: String,
    val phone: String,
//    @JsonProperty("birth")
//    @JsonFormat(pattern = "MM/dd/yyyy")
//    var birthDate: Date? = null
)