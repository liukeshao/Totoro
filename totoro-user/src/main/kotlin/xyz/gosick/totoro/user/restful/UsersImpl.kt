package xyz.gosick.totoro.user.restful

import org.springframework.web.bind.annotation.RestController

@RestController
class UsersImpl : Users {

    override fun findUserById(id: Long): String {
        return "111111"
    }
}