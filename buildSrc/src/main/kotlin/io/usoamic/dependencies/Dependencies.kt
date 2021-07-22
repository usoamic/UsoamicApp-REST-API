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

    object Documentation {
        object SpringFox {
            const val starter = "io.springfox:springfox-boot-starter:${Versions.Documentation.SpringFox.starter}"
            const val ui = "io.springfox:springfox-swagger-ui:${Versions.Documentation.SpringFox.ui}"
        }
    }

    object Kotlin {
        const val reflect = "org.jetbrains.kotlin:kotlin-reflect"
        const val stdLibJDK8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8"
    }

    object Database {
        const val postgresql = "org.postgresql:postgresql"
        const val flywayCore = "org.flywaydb:flyway-core"
        const val hibernate = "org.hibernate:hibernate-core:${Versions.Database.hibernate}"
    }

    object Other {
        const val jacksonKotlin = "com.fasterxml.jackson.module:jackson-module-kotlin"
    }
}