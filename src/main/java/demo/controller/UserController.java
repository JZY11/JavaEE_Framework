package demo.controller;

import demo.model.User;
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


    @RequestMapping("create")
    private  String create(User user){
        //todo   将来是MyBatis来做，将数据存入数据库
        System.out.println("create.....");
        return "redirect:/index.jsp";//重定向到index.jsp
    }
}
