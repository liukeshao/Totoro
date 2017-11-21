package xyz.gosick.totoro.user.model

import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name="totoro_users")
data class User(
        @Id @GeneratedValue var id: Long,
        var nickname: String,
        var displayName: String,
        var password: String,
        var mobile: String,
        var email: String,
        var type: Int,
        var status: Int,
        var createTime: Date,
        var updateTime: Date) {
    enum class Status(val value: Int) {
        ACTIVE(1), LOCK(-1)
    }
}