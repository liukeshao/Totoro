package xyz.gosick.totoro.web

import org.springframework.boot.runApplication
import org.springframework.cloud.client.SpringCloudApplication
import org.springframework.cloud.netflix.feign.EnableFeignClients


/**
 * Created by ks on 2017/4/21.
 */
@EnableFeignClients
@SpringCloudApplication
class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}