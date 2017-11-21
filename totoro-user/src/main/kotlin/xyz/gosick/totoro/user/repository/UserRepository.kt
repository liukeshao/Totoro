package xyz.gosick.totoro.user.repository

import org.springframework.data.repository.CrudRepository
import xyz.gosick.totoro.user.model.User

interface UserRepository : CrudRepository<User, Long>