package demo.dao.impl;

import demo.dao.BookDao;
import demo.model.Book;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by zhenya.1291813139.com
 * on 2017/10/25.
 * JavaEE_Framework.
 */
@Repository
public class BookDaoImpl implements BookDao{

    @Autowired
    private SqlSession sqlSession;

    @Override
    public void create(Book book) {
        sqlSession.insert("book.create",book);
    }
}
