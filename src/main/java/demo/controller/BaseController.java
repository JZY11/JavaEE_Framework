package demo.controller;

import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by zhenya.1291813139.com
 * on 2017/10/23.
 * JavaEE_Framework.
 */
/*
   //spring MVC 里面我们如何来获取原来的request、response以及一些其他的对象？
 */
public class BaseController {
    HttpServletRequest request;
    HttpServletResponse response;
    HttpSession session;
    ServletContext application;//ServletContext是定义jsp隐式对象application的一个接口

    @ModelAttribute    //模型的属性
    private void set(HttpServletRequest request, HttpServletResponse response) {
        this.request = request;
        this.response = response;
        session = request.getSession();
        application = request.getServletContext();
    }
}
