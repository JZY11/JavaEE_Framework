package demo.dao;

import demo.model.User;

/**
 * Created by zhenya.1291813139.com
 * on 2017/10/24.
 * JavaEE_Framework.
 */
/*
   用来实现松散耦合，就是将控制器类中的关于MyBatis的东西去掉
 */
public interface UserDao extends GenericDao<User>{
//    void create(User user);
//
//    User query(User user);//SQL语句    select   由signIn改为query
}
