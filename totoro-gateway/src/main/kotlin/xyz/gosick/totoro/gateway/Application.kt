package xyz.gosick.totoro.gateway

import org.springframework.boot.SpringApplication
import org.springframework.cloud.client.SpringCloudApplication
import org.springframework.cloud.netflix.zuul.EnableZuulProxy

@EnableZuulProxy
@SpringCloudApplication
class Application

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}