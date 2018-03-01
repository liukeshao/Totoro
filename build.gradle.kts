import io.spring.gradle.dependencymanagement.dsl.DependencyManagementExtension
import org.gradle.kotlin.dsl.version
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
    val springBootVersion = "2.0.0.RELEASE"
    val junitPluginVersion = "1.1.0"
    project.extra.set("springBootVersion", springBootVersion)

    repositories {
        mavenLocal()
        maven("http://maven.aliyun.com/nexus/content/groups/public/")
        maven("https://repo.spring.io/milestone")
    }

    dependencies {
        classpath("org.springframework.boot:spring-boot-gradle-plugin:$springBootVersion")
        classpath("org.junit.platform:junit-platform-gradle-plugin:$junitPluginVersion")
    }
}

plugins {
    val kotlinVersion = "1.2.21"
    val dependencyManagementVersion = "1.0.4.RELEASE"
    val dockerGradlePluginVersion = "0.17.2"

    id("org.jetbrains.kotlin.jvm") version kotlinVersion
    id("org.jetbrains.kotlin.plugin.spring") version kotlinVersion
    id("org.jetbrains.kotlin.plugin.allopen") version kotlinVersion
    id("org.jetbrains.kotlin.plugin.noarg") version kotlinVersion
    id("org.jetbrains.kotlin.plugin.jpa") version kotlinVersion
    id("org.jetbrains.kotlin.kapt") version kotlinVersion
    id("io.spring.dependency-management") version dependencyManagementVersion
}

allprojects {
    group = "xyz.gosick.totoro"
    version = "0.0.1-SNAPSHOT"

    repositories {
        mavenLocal()
        maven("http://maven.aliyun.com/nexus/content/groups/public/")
        maven("https://repo.spring.io/milestone")
    }
}

subprojects {
    apply {
        plugin("idea")
        plugin("eclipse")
        plugin("java")
        plugin("org.junit.platform.gradle.plugin")
        plugin("io.spring.dependency-management")
        plugin("org.jetbrains.kotlin.jvm")
        plugin("org.jetbrains.kotlin.kapt")
        plugin("org.jetbrains.kotlin.plugin.allopen")
        plugin("org.jetbrains.kotlin.plugin.spring")
        plugin("org.jetbrains.kotlin.plugin.noarg")
        plugin("org.jetbrains.kotlin.plugin.jpa")
    }

    dependencies {
        compile("org.jetbrains.kotlin:kotlin-stdlib")
        compile("org.jetbrains.kotlin:kotlin-reflect")
        compile("com.fasterxml.jackson.module:jackson-module-kotlin")

        testCompile("org.junit.jupiter:junit-jupiter-api")
        testRuntime("org.junit.jupiter:junit-jupiter-engine")
    }

    configure<DependencyManagementExtension> {
        imports {
            val springBootVersion = parent!!.extra.get("springBootVersion")
            val springCloudVersion = "Finchley.M7"
            mavenBom("org.springframework.cloud:spring-cloud-dependencies:$springCloudVersion")
            mavenBom("org.springframework.boot:spring-boot-parent:$springBootVersion")
        }

        dependencies {
            val jjwtVsersion = "0.9.0"
            dependency("io.jsonwebtoken:jjwt:$jjwtVsersion")
        }
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions {
            jvmTarget = "1.8"
            freeCompilerArgs = listOf("-Xjsr305=strict")
        }
    }

}

