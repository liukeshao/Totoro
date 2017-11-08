package xyz.gosick.totoro.user.model

import xyz.gosick.totoro.common.annotation.NoArg
import java.util.*


/**
 * Created by ks on 2017/4/22.
 */
@NoArg
data class User(var id: Long,
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