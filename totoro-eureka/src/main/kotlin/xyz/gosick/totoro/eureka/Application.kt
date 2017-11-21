package xyz.gosick.totoro.eureka

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@EnableEurekaServer
@SpringBootApplication
class Application


fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}