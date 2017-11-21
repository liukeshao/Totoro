package xyz.gosick.totoro.user.rest

import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import xyz.gosick.totoro.common.model.Response
import xyz.gosick.totoro.user.model.User
import xyz.gosick.totoro.user.service.UserService

@RestController
class UsersImpl(val userService: UserService) : Users {

    override fun findUserById(@PathVariable id: Long): Response<User> {
        return userService.findById(id)
    }

}