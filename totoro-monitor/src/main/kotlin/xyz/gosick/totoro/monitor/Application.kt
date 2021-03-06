package xyz.gosick.totoro.monitor

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard
import org.springframework.cloud.netflix.turbine.EnableTurbine

@EnableTurbine
@EnableHystrixDashboard
@SpringBootApplication
class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}