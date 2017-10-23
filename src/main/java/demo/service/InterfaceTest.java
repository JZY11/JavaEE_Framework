package demo.service;

import demo.model.User;

import java.util.List;

/**
 * Created by zhenya.1291813139.com
 * on 2017/10/23.
 * JavaEE_Framework.
 */
public interface InterfaceTest {
    int createUser(User user);
    int updateUser(User user);
    int deleteUser(User user);

    List<User> queryAll();
    User queryById(int id);
}
