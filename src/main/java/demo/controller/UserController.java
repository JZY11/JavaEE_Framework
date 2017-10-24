package demo.controller;

import demo.dao.UserDao;
import demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhenya.1291813139.com
 * on 2017/10/23.
 * JavaEE_Framework.
 */
/*
    已经实现可松散耦合，因为当前类中已经看不到任何MyBatis的东西了
    UserController依赖于UserDao(接口声明的域)，在UserController实例化之前要先实例化UserDao
    而UserDao是个接口不能被实例化，只有它的实现类才可以实例化而UserDaoImpl与我们的UserController没有关联，需要配置下
    不是在spring配置文件：application.xml中配置，而是采用注解的方式进行配置
    只需要将UserDaoImpl装配进spring容器中采用配置的形式@Repository将其注册成一个bean
 */
@Controller   //该注解会使当前类自动注册为spring容器中的bean
@RequestMapping("user")   //请求的映射
public class UserController extends BaseController{

    @Autowired    //域级别的注解，从spring容器中取出该bean（必须是该接口的实现类）然后自动装配进UserController
    private UserDao userDao;

    @RequestMapping("create")    //方法级别的注解
    private  String create(User user){
        //todo   将来是MyBatis来做，将数据存入数据库
        userDao.create(user);
        System.out.println("user:" + user);
        return "redirect:/default.jsp";//重定向到index.jsp
    }

    @RequestMapping("signIn")
    private String signIn(User user){
        user = userDao.signIn(user);
        if (user != null){
            session.setAttribute("user", user);
            return "redirect:/index.jsp";
        }
        //以前登录失败的做法：req.setAttribute("message","用户名或者密码错误");
        request.setAttribute("message", "用户名或者密码错误");
        return "/default.jsp";//登录失败
    }

    @RequestMapping("signOut")
    private String signOut(){
        session.invalidate();
        return "redirect:/index.jsp";
    }
}
