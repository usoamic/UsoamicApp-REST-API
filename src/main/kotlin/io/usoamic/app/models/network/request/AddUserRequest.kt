package io.usoamic.app.models.network.request

import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

data class AddUserRequest(
    @JsonProperty(required = true)
    @NotEmpty(message = "Private Key cannot be empty")
    @NotBlank(message = "Private Key cannot be blank")
    @NotNull(message = "Private Key cannot be null")
    val privateKey: String,

    @JsonProperty(required = true)
    @NotEmpty(message = "Phone cannot be empty")
    @NotBlank(message = "Phone cannot be blank")
    @NotNull(message = "Phone cannot be null")
    val phone: String,

    @JsonProperty(required = true)
    @NotEmpty(message = "Chat ID cannot be empty")
    @NotBlank(message = "Chat ID cannot be blank")
    @NotNull(message = "Chat ID cannot be null")
    val chatId: Long
)