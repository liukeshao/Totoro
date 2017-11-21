package xyz.gosick.totoro.gateway

import org.springframework.boot.runApplication
import org.springframework.cloud.client.SpringCloudApplication
import org.springframework.cloud.netflix.zuul.EnableZuulProxy

@EnableZuulProxy
@SpringCloudApplication
class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}