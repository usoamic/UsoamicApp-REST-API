package io.usoamic.app.configs

import io.usoamic.commons.crossplatform.repositories.api.NotesRepository
import io.usoamic.commons.crossplatform.repositories.impl.NotesRepositoryImpl
import io.usoamic.usoamickt.core.Usoamic
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import javax.inject.Inject

@Configuration
class NotesRepositoryConfig @Inject constructor(
    private val usoamic: Usoamic
) {
    @Bean
    fun bindNotesRepository(): NotesRepository {
        return NotesRepositoryImpl(
            usoamic = usoamic
        )
    }
}