package io.usoamic.app.configs

import io.usoamic.commons.crossplatform.repositories.api.EthereumRepository
import io.usoamic.commons.crossplatform.repositories.impl.EthereumRepositoryImpl
import io.usoamic.usoamickt.core.Usoamic
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import javax.inject.Inject

@Configuration
class EthereumRepositoryConfig @Inject constructor(
    private val usoamic: Usoamic
) {
    @Bean
    fun bindEthereumRepository(): EthereumRepository {
        return EthereumRepositoryImpl(
            usoamic = usoamic
        )
    }
}