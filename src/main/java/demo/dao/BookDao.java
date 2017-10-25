package demo.dao;

import demo.model.Book;

/**
 * Created by zhenya.1291813139.com
 * on 2017/10/25.
 * JavaEE_Framework.
 */
/*
    接口继承接口就继承了接口中的所有抽象方法，而且此父接口还比较特别，因为该父接口是泛型的接口
 */
public interface BookDao extends GenericDao<Book>{

}
