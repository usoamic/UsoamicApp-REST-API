package io.usoamic.dependencies

object Dependencies {
    object Spring {
        const val securityTest = "org.springframework.security:spring-security-test"
    }

    object SpringBoot {
        object Starter {
            const val dataJpa = "org.springframework.boot:spring-boot-starter-data-jpa"
            const val jooq = "org.springframework.boot:spring-boot-starter-jooq"
            const val security = "org.springframework.boot:spring-boot-starter-security"
            const val validation = "org.springframework.boot:spring-boot-starter-validation"
            const val web = "org.springframework.boot:spring-boot-starter-web"
            const val test = "org.springframework.boot:spring-boot-starter-test"
        }

        const val configurationProcessor = "org.springframework.boot:spring-boot-configuration-processor"
        const val devTools = "org.springframework.boot:spring-boot-devtools"
    }

    object Java {
        const val inject = "javax.inject:javax.inject:1"
    }

    object Kotlin {
        const val reflect = "org.jetbrains.kotlin:kotlin-reflect"
        const val stdLibJDK8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8"
    }

    object Usoamic {
        const val kt = "com.github.usoamic:usoamickt:v${Versions.Usoamic.kt}"
        const val validateUtilKt = "com.github.usoamic:validateutil:v${Versions.Usoamic.validateUtilKt}"
        const val commonsKtCrossPlatform = "com.github.usoamic:usoamic-commons-crossplatform:v${Versions.Usoamic.commonsKtCrossPlatform}"
    }

    object Cryptocurrency {
        const val web3j = "org.web3j:core:${Versions.Cryptocurrency.web3j}"
    }

    object Documentation {
        object SpringFox {
            const val starter = "io.springfox:springfox-boot-starter:${Versions.Documentation.SpringFox.starter}"
            const val ui = "io.springfox:springfox-swagger-ui:${Versions.Documentation.SpringFox.ui}"
        }
    }

    object Test {
        const val mockk = "io.mockk:mockk:${Versions.Test.mockk}"
    }

    object Database {
        const val postgresql = "org.postgresql:postgresql"
        const val flywayCore = "org.flywaydb:flyway-core"
        const val hibernate = "org.hibernate:hibernate-core:${Versions.Database.hibernate}"
    }

    object Mapping {
        const val mapStruct = "org.mapstruct:mapstruct:${Versions.Mapping.mapStruct}"
        const val mapStructProcessor = "org.mapstruct:mapstruct-processor:${Versions.Mapping.mapStruct}"
    }

    object Other {
        const val jacksonKotlin = "com.fasterxml.jackson.module:jackson-module-kotlin"
    }
}