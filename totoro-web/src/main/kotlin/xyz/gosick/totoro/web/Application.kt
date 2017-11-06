package xyz.gosick.totoro.web

import org.springframework.boot.SpringApplication
import org.springframework.cloud.client.SpringCloudApplication
import org.springframework.cloud.netflix.feign.EnableFeignClients


/**
 * Created by ks on 2017/4/21.
 */
@EnableFeignClients
@SpringCloudApplication
class Application

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}