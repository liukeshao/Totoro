package xyz.gosick.totoro.user.restful

import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import xyz.gosick.totoro.user.dao.UserDao
import xyz.gosick.totoro.user.model.User

@RestController
class UsersImpl(val userDao: UserDao) : Users {

    override fun findUserById(@PathVariable id: Long): User {
        return userDao.findById(id)
    }

}