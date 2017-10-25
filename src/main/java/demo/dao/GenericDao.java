package demo.dao;

import java.util.List;

/**
 * Created by zhenya.1291813139.com
 * on 2017/10/25.
 * JavaEE_Framework.
 */
//定义泛型接口   泛型既可以定义类又可以定义接口   用T来指代模型类model
// Model  Entity  Domain 这三个的含义是一样的
public interface GenericDao<T> {

//以下的方法都是数据库通用的方法，与具体业务逻辑无关

    void create(T t);

    T query(String statement, Object parameter);//根据给定的语句以及给定的参数来返回当前模型类的一个实例

    List<T> queryAll();

    T queryById(int id);

    void modify(T t);

    void remove(int id);
}
