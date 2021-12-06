import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import io.usoamic.dependencies.*

plugins {
    id("org.springframework.boot") version "2.5.2"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    kotlin("jvm") version "1.5.21"
    kotlin("kapt") version "1.5.21"
    kotlin("plugin.spring") version "1.5.21"
    kotlin("plugin.jpa") version "1.5.21"
}

group = "io.usoamic"
version = "1.0.0-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

kapt {
    generateStubs = true
}

repositories {
    mavenCentral()
    maven(url = "https://oss.sonatype.org/content/repositories/snapshots")
    maven(url = "https://jitpack.io")
}

dependencies {
    /*
     * Implementations
     */
    implementation(Dependencies.SquareUp.okHttp)
    implementation(Dependencies.SpringBoot.Starter.validation)
    implementation(Dependencies.SpringBoot.Starter.web)
    implementation(Dependencies.Java.inject)
    implementation(Dependencies.Kotlin.reflect)
    implementation(Dependencies.Kotlin.stdLibJDK8)
    implementation(Dependencies.Usoamic.kt)
    implementation(Dependencies.Usoamic.commonsKtCrossPlatform)
    implementation(Dependencies.Usoamic.validateUtilKt)
    implementation(Dependencies.Cryptocurrency.web3j)
    implementation(Dependencies.Documentation.SpringFox.starter)
    implementation(Dependencies.Documentation.SpringFox.ui)
    implementation(Dependencies.Mapping.mapStruct)
    implementation(Dependencies.Other.jacksonKotlin)

    /*
     * Kapt
     */
    kapt(Dependencies.Mapping.mapStructProcessor)

    /*
     * DevelopmentOnly
     */
    developmentOnly(Dependencies.SpringBoot.devTools)

    /*
     * AnnotationProcessor
     */
    annotationProcessor(Dependencies.SpringBoot.configurationProcessor)

    /*
     * TestImplementation
     */
    testImplementation(Dependencies.SpringBoot.Starter.test)
    testImplementation(Dependencies.Test.mockk)
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
