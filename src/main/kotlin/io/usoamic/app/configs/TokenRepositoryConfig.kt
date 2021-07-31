package io.usoamic.app.configs

import io.usoamic.commons.crossplatform.repositories.api.TokenRepository
import io.usoamic.commons.crossplatform.repositories.impl.TokenRepositoryImpl
import io.usoamic.usoamickt.core.Usoamic
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import javax.inject.Inject

@Configuration
class TokenRepositoryConfig @Inject constructor(
    private val usoamic: Usoamic
) {
    @Bean
    fun bindTokenRepository(): TokenRepository {
        return TokenRepositoryImpl(
            usoamic = usoamic
        )
    }
}