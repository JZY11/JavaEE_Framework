package demo.dao.impl;

import demo.dao.UserDao;
import demo.model.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by zhenya.1291813139.com
 * on 2017/10/24.
 * JavaEE_Framework.
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired //自动装配就来
    private SqlSession sqlSession;


    @Override
    public void create(User user){
            sqlSession.insert("user.create", user);

    }

    @Override
    public User query(User user){
            return sqlSession.selectOne("user.signIn", user);

    }

    @Override
    public List<User> queryAll() {
        return null;
    }

    @Override
    public User queryById(int id) {
        return null;
    }

    @Override
    public void modify(User user) {

    }

    @Override
    public void remove(int id) {

    }
}
