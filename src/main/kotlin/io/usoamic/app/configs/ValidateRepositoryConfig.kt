package io.usoamic.app.configs

import io.usoamic.commons.crossplatform.repositories.api.ValidateRepository
import io.usoamic.commons.crossplatform.repositories.impl.ValidateRepositoryImpl
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ValidateRepositoryConfig {
    @Bean
    fun bindValidateRepository(): ValidateRepository {
        return ValidateRepositoryImpl()
    }
}