package demo.dao.impl;

import demo.dao.BookDao;
import demo.model.Book;
import org.springframework.stereotype.Repository;

/**
 * Created by zhenya.1291813139.com
 * on 2017/10/25.
 * JavaEE_Framework.
 */
@Repository
public class BookDaoImpl extends GenericDaoImpl<Book> implements BookDao{

//    @Autowired
//    private SqlSession sqlSession;
//
//    @Override
//    public void create(Book book) {
//        sqlSession.insert("book.create",book);
//    }
//
//    @Override
//    public Book query(Book book) {
//        return null;
//    }
//
//    @Override
//    public List<Book> queryAll() {
//        return sqlSession.selectList("book.queryAll");
//    }
//
//    @Override
//    public Book queryById(int id) {
//        return sqlSession.selectOne("book.queryById",id);
//    }
//
//    @Override
//    public void modify(Book book) {
//        sqlSession.update("book.modify",book);
//    }
//
//    @Override
//    public void remove(int id) {
//        sqlSession.delete("book.remove",id);
//    }
}
