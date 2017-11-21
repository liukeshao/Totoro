package xyz.gosick.totoro.user.dto

import java.util.*


/**
 * Created by ks on 2017/4/22.
 */
data class UserDto(var id: Long,
                   var nickname: String,
                   var displayName: String,
                   var password: String,
                   var mobile: String,
                   var email: String,
                   var type: Int,
                   var status: Int,
                   var createTime: Date,
                   var updateTime: Date)