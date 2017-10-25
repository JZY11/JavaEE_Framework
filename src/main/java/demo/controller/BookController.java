package demo.controller;

import demo.dao.BookDao;
import demo.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhenya.1291813139.com
 * on 2017/10/25.
 * JavaEE_Framework.
 */
@Controller
@RequestMapping("book")
public class BookController extends BaseController {

    @Autowired
    private BookDao bookDao;

    @RequestMapping("create")
    private String create(Book book){
        bookDao.create(book);
        return "redirect:/book/queryAll";
    }

    @RequestMapping("queryAll")
    private String queryAll(){
        session.setAttribute("books",bookDao.queryAll());
        return "redirect:/index.jsp";
    }

    @RequestMapping("queryById/{id}")
    private String queryById(@PathVariable int id){//参数级别的注解：@PathVariable
        session.setAttribute("books",bookDao.queryById(id));
        return "redirect:/edit.jsp";
    }

    @RequestMapping("modify")
    private String modify(Book book){
        System.out.println("..........");
        bookDao.modify(book);
        return "redirect:/book/queryAll";
    }

    @RequestMapping("remove/{id}")
    private String remove(@PathVariable int id){
        bookDao.remove(id);
        return "redirect:/book/queryAll";
    }
}
