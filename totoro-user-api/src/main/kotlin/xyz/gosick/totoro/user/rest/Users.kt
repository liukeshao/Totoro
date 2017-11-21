package xyz.gosick.totoro.user.rest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import xyz.gosick.totoro.common.model.Response
import xyz.gosick.totoro.user.model.User

@RequestMapping("/api/user")
interface Users {

    @GetMapping("/{id}")
    fun findUserById(id: Long): Response<User>
}