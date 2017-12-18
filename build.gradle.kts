import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
    repositories {
        mavenLocal()
        maven("http://maven.aliyun.com/nexus/content/groups/public/")
        maven("https://repo.spring.io/milestone")
    }

    dependencies {
        classpath("org.springframework.boot:spring-boot-gradle-plugin:2.0.0.M7")
        classpath("org.junit.platform:junit-platform-gradle-plugin:1.0.2")
    }
}


plugins {
    val kotlinVersion = "1.2.10"
    id("org.jetbrains.kotlin.jvm") version kotlinVersion
    id("org.jetbrains.kotlin.plugin.spring") version kotlinVersion
    id("org.jetbrains.kotlin.plugin.allopen") version kotlinVersion
    id("org.jetbrains.kotlin.plugin.noarg") version kotlinVersion
    id("org.jetbrains.kotlin.plugin.jpa") version kotlinVersion
    id("org.jetbrains.kotlin.kapt") version kotlinVersion
    id("io.spring.dependency-management") version "1.0.4.RELEASE"
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
//        plugin("org.springframework.boot")
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
    }

    dependencyManagement {
        imports {
            mavenBom("org.springframework.cloud:spring-cloud-dependencies:Finchley.M5")
            mavenBom("org.springframework.boot:spring-boot-parent:2.0.0.M7")
        }
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions {
            jvmTarget = "1.8"
            freeCompilerArgs = listOf("-Xjsr305=strict")
        }
    }
}

