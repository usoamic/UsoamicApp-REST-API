import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import io.usoamic.dependencies.*

plugins {
    id("org.springframework.boot") version "2.5.2"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    kotlin("jvm") version "1.5.20"
    kotlin("plugin.spring") version "1.5.20"
    kotlin("plugin.jpa") version "1.5.20"
}

group = "io.usoamic"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(Dependencies.SpringBoot.Starter.dataJpa)
    implementation(Dependencies.SpringBoot.Starter.jooq)
    implementation(Dependencies.SpringBoot.Starter.security)
    implementation(Dependencies.SpringBoot.Starter.validation)
    implementation(Dependencies.SpringBoot.Starter.web)
    implementation(Dependencies.Other.jacksonKotlin)
    implementation(Dependencies.Other.flywayCore)
    implementation(Dependencies.Kotlin.reflect)
    implementation(Dependencies.Kotlin.stdLibJDK8)
    implementation(Dependencies.Database.liquibaseCore)
    developmentOnly(Dependencies.SpringBoot.devTools)
    runtimeOnly(Dependencies.Database.postgre)
    annotationProcessor(Dependencies.SpringBoot.configurationProcessor)
    testImplementation(Dependencies.SpringBoot.Starter.test)
    testImplementation(Dependencies.Spring.securityTest)
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "11"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
