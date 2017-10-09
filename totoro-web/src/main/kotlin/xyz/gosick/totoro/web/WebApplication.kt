package xyz.gosick.totoro.web

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.session.MapSessionRepository
import org.springframework.session.config.annotation.web.http.EnableSpringHttpSession
import java.util.concurrent.ConcurrentHashMap


/**
 * Created by ks on 2017/4/21.
 */
@EnableSpringHttpSession
@SpringBootApplication(scanBasePackages = arrayOf("xyz.gosick.totoro"))
class WebApplication {
    @Bean
    fun sessionRepository(): MapSessionRepository {
        return MapSessionRepository(ConcurrentHashMap())
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(WebApplication::class.java, *args)
}