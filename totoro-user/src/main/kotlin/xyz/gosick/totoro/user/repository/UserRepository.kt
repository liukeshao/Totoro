package xyz.gosick.totoro.user.repository

import org.springframework.data.jpa.repository.JpaRepository
import xyz.gosick.totoro.user.model.User

interface UserRepository : JpaRepository<User, Long>