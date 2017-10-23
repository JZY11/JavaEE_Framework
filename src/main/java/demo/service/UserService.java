package demo.service;

import demo.mapper.UserMapper;
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

    private InterfaceTest interfaceTest;

    public void setInterfaceTest(InterfaceTest interfaceTest) {
        this.interfaceTest = interfaceTest;
    }

    private static int createUser(){
        try(SqlSession sqlSession = MyBatisSqlSession.getSqlSession(true)){
            return sqlSession.insert("user.create",new User(null, "Jerry1", "123"));
        }
    }

    private static int updateUser(){
        try(SqlSession sqlSession = MyBatisSqlSession.getSqlSession(true)){
            return sqlSession.update("user.update", new User(1,"tester","test"));
        }
    }

    private static int deleteUser(){
        try(SqlSession sqlSession = MyBatisSqlSession.getSqlSession(true)){
            return sqlSession.delete("user.delete",1);
        }
    }

    private static List<User> queryAll(){//查询与事务无关，所以可以用false
        try(SqlSession sqlSession = MyBatisSqlSession.getSqlSession(false)){
            return sqlSession.selectList("user.queryAll");
        }
    }

    private static User queryById(){
        try(SqlSession sqlSession = MyBatisSqlSession.getSqlSession(false)){
            return sqlSession.selectOne("user.queryById",33);
        }
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
        List<User> users = queryAll();
        for (User user : users) {
            System.out.println(user);
        }

        System.out.println(queryById());
    }
}
