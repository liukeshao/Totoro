package xyz.gosick.totoro.web

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.session.EnableSpringWebSession
import org.springframework.session.MapReactorSessionRepository
import org.springframework.session.Session
import java.util.concurrent.ConcurrentHashMap


/**
 * Created by ks on 2017/4/21.
 */
@EnableSpringWebSession
@SpringBootApplication(scanBasePackages = arrayOf("xyz.gosick.totoro"))
class WebApplication {
    @Bean
    fun reactorSessionRepository(): MapReactorSessionRepository {

        return MapReactorSessionRepository(ConcurrentHashMap<String, Session>())
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(WebApplication::class.java, *args)
}