package xyz.gosick.totoro.web.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.server.WebSession
import xyz.gosick.totoro.user.mapper.UserMappper
import xyz.gosick.totoro.user.model.User
import java.util.*

/**
 * Created by ks on 2017/4/22.
 */
@RestController
@RequestMapping("/api/user")
class UserController(val userMappper: UserMappper) {

    @GetMapping
    fun getUser(session: WebSession): User {
        session.attributes.put("name", "test")
        return User(1L, "test", "test", "test", "test", "test", 1, 1, "test", "test", Date(), Date())
    }

    @GetMapping("/test")
    fun test(): String {
        throw Exception("test")
    }

}