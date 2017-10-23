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
public class MyBatis implements InterfaceTest {
    @Override
    public int createUser(User user) {
        try (SqlSession sqlSession = MyBatisSqlSession.getSqlSession(true)) {
            return sqlSession.insert("user.create",user);

        }
    }

    @Override
    public int updateUser(User user) {
        return 0;
    }

    @Override
    public int deleteUser(User user) {
        return 0;
    }

    @Override
    public List<User> queryAll() {
        return null;
    }

    @Override
    public User queryById(int id) {
        return null;
    }
}
