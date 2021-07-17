package io.usoamic.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class UsoamicAppRestApiApplication

fun main(args: Array<String>) {
    runApplication<UsoamicAppRestApiApplication>(*args)
}
