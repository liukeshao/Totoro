package xyz.gosick.totoro.user

import org.springframework.boot.runApplication
import org.springframework.cloud.client.SpringCloudApplication


@SpringCloudApplication
class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}