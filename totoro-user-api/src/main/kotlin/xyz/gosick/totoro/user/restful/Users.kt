package xyz.gosick.totoro.user.restful

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

interface Users {
    @GetMapping("/api/user")
    fun findUserById(@RequestParam id: Long): String
}