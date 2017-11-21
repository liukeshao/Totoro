package xyz.gosick.totoro.user.service

import org.springframework.stereotype.Service
import xyz.gosick.totoro.common.model.Response
import xyz.gosick.totoro.user.model.User
import xyz.gosick.totoro.user.repository.UserRepository

@Service
class UserService(val userRepository: UserRepository) {

    fun findAll(): List<User> {
        val all = userRepository.findAll()
        return all.toList()
    }

    fun findById(id: Long): Response<User> {
        val optional = userRepository.findById(id)
        if (!optional.isPresent) {
            return Response.fail("user.not.exist")
        }
        return Response.success(optional.get())
    }
}