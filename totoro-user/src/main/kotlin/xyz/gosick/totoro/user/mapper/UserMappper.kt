package xyz.gosick.totoro.user.mapper

import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param
import org.apache.ibatis.annotations.Select
import xyz.gosick.totoro.user.model.User

/**
 * Created by ks on 2017/4/22.
 */
@Mapper
interface UserMappper {
    @Select("SELECT * FROM TOTORO_USERS WHERE id = #{id}")
    fun findById(@Param("id") id: Long): User
}