package demo.service;

import demo.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhenya.1291813139.com
 * on 2017/10/23.
 * JavaEE_Framework.
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("test/beans.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");

        User user = new User("new user", "new password");
//        userService.createUser(user);
    }
}
