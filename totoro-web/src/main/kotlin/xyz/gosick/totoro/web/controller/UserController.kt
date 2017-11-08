package xyz.gosick.totoro.web.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import xyz.gosick.totoro.user.model.User
import xyz.gosick.totoro.web.service.UsersClient

/**
 * Created by ks on 2017/4/22.
 */
@RestController
@RequestMapping
class UserController(val usersClient: UsersClient) {

    @GetMapping("/test")
    fun test(): User {
        return usersClient.findUserById(1L)
    }

}