package xyz.gosick.totoro.user.dao

import org.apache.ibatis.session.SqlSession
import org.springframework.stereotype.Repository
import xyz.gosick.totoro.user.model.User

@Repository
class UserDao(val sqlSession: SqlSession) {

    fun findById(id: Long) : User {
        return sqlSession.selectOne("User.findById", id)
    }
}