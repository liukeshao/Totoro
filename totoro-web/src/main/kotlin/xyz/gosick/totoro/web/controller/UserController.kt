package xyz.gosick.totoro.web.controller

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import xyz.gosick.totoro.user.mapper.UserMappper
import xyz.gosick.totoro.user.model.User
import xyz.gosick.totoro.web.exception.RestfulException
import javax.servlet.http.HttpSession

/**
 * Created by ks on 2017/4/22.
 */
@RestController
@RequestMapping("/api/user")
class UserController(val userMappper: UserMappper) {

    @GetMapping
    fun getUser(session: HttpSession): User {
        session.setAttribute("name", "test")
        return userMappper.findById(1L)
    }

    @GetMapping("/test")
    fun test(): String {
        throw Exception("test")
    }

}