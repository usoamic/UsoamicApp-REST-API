package io.usoamic.app.configs

import io.usoamic.commons.crossplatform.repositories.api.UserRepository
import io.usoamic.commons.crossplatform.repositories.impl.UserRepositoryImpl
import io.usoamic.usoamickt.core.Usoamic
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import javax.inject.Inject

@Configuration
class UserRepositoryConfig @Inject constructor(
    private val usoamic: Usoamic
) {
    @Bean
    fun bindUserRepository(): UserRepository {
        return UserRepositoryImpl(
            usoamic = usoamic
        )
    }
}