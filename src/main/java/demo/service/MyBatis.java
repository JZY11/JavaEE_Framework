package demo.service;

import demo.model.User;
import demo.util.MyBatisSqlSession;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by zhenya.1291813139.com
 * on 2017/10/23.
 * JavaEE_Framework.
 */
public class MyBatis implements UserDao {
    @Override
    public int createUser(User user) {
        try (SqlSession sqlSession = MyBatisSqlSession.getSqlSession(true)) {
            return sqlSession.insert("user.create",user);
        }
    }

    @Override
    public int updateUser(User user) {
        try(SqlSession sqlSession = MyBatisSqlSession.getSqlSession(true)){
        return sqlSession.update("user.update",user);
        }
    }

    @Override
    public int deleteUser(User user) {
        try(SqlSession sqlSession = MyBatisSqlSession.getSqlSession(true)){
        return sqlSession.delete("user.delete",user);
        }
    }

    @Override
    public List<User> queryAll() {
        try(SqlSession sqlSession = MyBatisSqlSession.getSqlSession(false)){
        return sqlSession.selectList("user.queryAll");
        }
    }

    @Override
    public User queryById(int id) {
        try(SqlSession sqlSession = MyBatisSqlSession.getSqlSession(false)){
        return sqlSession.selectOne("user.queryById",id);
        }
    }
}
