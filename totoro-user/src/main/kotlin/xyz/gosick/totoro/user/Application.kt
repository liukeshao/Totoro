package xyz.gosick.totoro.user

import org.springframework.boot.SpringApplication
import org.springframework.cloud.client.SpringCloudApplication

@SpringCloudApplication
class Application

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}