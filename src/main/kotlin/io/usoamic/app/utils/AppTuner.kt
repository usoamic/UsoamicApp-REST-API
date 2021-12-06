package io.usoamic.app.utils

import io.usoamic.app.services.AccountService
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@Component
class AppTuner(
    private val accountService: AccountService,
    @Value("\${usoamic.wallet-password}")
    private val walletPassword: String,
) {
    @PostConstruct
    fun createAccount() {
        if (!accountService.hasAccount()) {
            val credentials = accountService.createCredentials()

            accountService.addAccount(
                password = walletPassword,
                privateKey = credentials.privateKey
            )
        }
    }
}