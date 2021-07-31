package io.usoamic.app.configs

import io.usoamic.usoamickt.core.Usoamic
import io.usoamic.usoamickt.enumcls.NetworkType
import io.usoamic.usoamickt.enumcls.NodeProvider
import io.usoamic.usoamickt.util.DirectoryUtils
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class UsoamicConfig(
    @Value("\${usoamic.node-provider}")
    private val nodeProvider: String,
    @Value("\${usoamic.network-type}")
    private val networkType: String,
    @Value("\${usoamic.project-id}")
    private val projectId: String
) {
    @Bean
    fun provideContract(): Usoamic {
        return Usoamic(
            fileName = "account.json",
            filePath = DirectoryUtils.getDefaultKeyDirectory(),
            networkType = NetworkType.valueOf(networkType),
            NodeProvider.valueOf(
                provider = nodeProvider,
                args = projectId
            )
        )
    }
}
