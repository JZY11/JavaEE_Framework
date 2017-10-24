package demo.controller;

import demo.model.User;
import demo.util.MyBatisSqlSession;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhenya.1291813139.com
 * on 2017/10/23.
 * JavaEE_Framework.
 */
@Controller   //该注解会使当前类自动注册为spring容器中的bean
@RequestMapping("user")   //请求的映射
public class UserController {


    @RequestMapping("create")    //方法级别的注解
    private  String create(User user){
        //todo   将来是MyBatis来做，将数据存入数据库
        try(SqlSession sqlSession = MyBatisSqlSession.getSqlSession(true)){
            sqlSession.insert("user.create",user);
        }
        System.out.println("user:" + user);
        return "redirect:/default.jsp";//重定向到index.jsp
    }
}
