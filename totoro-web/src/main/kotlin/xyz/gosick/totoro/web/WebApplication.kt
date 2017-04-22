package xyz.gosick.totoro.web

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession

/**
 * Created by ks on 2017/4/21.
 */
@EnableRedisHttpSession
@SpringBootApplication(scanBasePackages = arrayOf("xyz.gosick.totoro"))
class WebApplication

fun main(args: Array<String>) {
    SpringApplication.run(WebApplication::class.java, *args)
}