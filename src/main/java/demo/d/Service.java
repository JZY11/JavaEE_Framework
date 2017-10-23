package demo.d;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhenya.1291813139.com
 * on 2017/10/23.
 * JavaEE_Framework.
 */
/*
    使用spring方式，输出 Hello:Tom
 */
public class Service {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Hello hello = applicationContext.getBean(Hello.class);
        hello.sayHello();
    }
}
