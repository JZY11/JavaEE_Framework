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
public class UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public  int createUser(User user){
//        try(SqlSession sqlSession = MyBatisSqlSession.getSqlSession(true)){
//            return sqlSession.insert("user.create",new User(null, "Jerry1", "123"));
        return userDao.createUser(user);
    }

    public int updateUser(User user){
//        try(SqlSession sqlSession = MyBatisSqlSession.getSqlSession(true)){
//            return sqlSession.update("user.update", new User(1,"tester","test"));
//        }
        return userDao.updateUser(user);
    }

    public int deleteUser(User user){
//        try(SqlSession sqlSession = MyBatisSqlSession.getSqlSession(true)){
//            return sqlSession.delete("user.delete",1);
//        }
        return userDao.deleteUser(user);
    }

    public List<User> queryAll(){//查询与事务无关，所以可以用false
//        try(SqlSession sqlSession = MyBatisSqlSession.getSqlSession(false)){
//            return sqlSession.selectList("user.queryAll");
//        }
        return userDao.queryAll();
    }

    public User queryById(int id){
//        try(SqlSession sqlSession = MyBatisSqlSession.getSqlSession(false)){
//            return sqlSession.selectOne("user.queryById",33);
//        }
        return userDao.queryById(id);
    }

    //不推荐使用接口的方式
//    private static int createUser(){
//        try(SqlSession sqlSession = MyBatisSqlSession.getSqlSession(true)){
//            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//            return userMapper.create(new User(null, "Jerry2", "123"));
//        }
//    }

    public static void main(String[] args) {
//        System.out.println(createUser());
//        System.out.println(createUser());
//        System.out.println(updateUser());
//        List<User> users = queryAll();
//        for (User user : users) {
//            System.out.println(user);
//        }
//        System.out.println(queryById());
    }
}
