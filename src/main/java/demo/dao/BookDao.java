package demo.dao;

import demo.model.Book;

import java.util.List;

/**
 * Created by zhenya.1291813139.com
 * on 2017/10/25.
 * JavaEE_Framework.
 */
public interface BookDao {

    void create(Book book);

    List<Book> queryAll();

    Book queryBookById(int id);

    void modify(Book book);
}
