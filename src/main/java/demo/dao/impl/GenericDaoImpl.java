package demo.dao.impl;

import demo.dao.GenericDao;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by zhenya.1291813139.com
 * on 2017/10/25.
 * JavaEE_Framework.
 */
/*
    如何在泛型类里获得它将来具体的某一个具体的子类的类的名字 ？？？
            先构造当前类的无参构造方法，
            在无参构造方法中写入一系列东西
 */
// 关于泛型接口的MyBatis的实现
public class GenericDaoImpl<T> implements GenericDao<T> {

    private String namespace;

    @Autowired
    private SqlSession sqlSession;

    public GenericDaoImpl() {//每次初始化这个类GenericDaoImpl<T>时都会被调用
        ParameterizedType parameterizedType = (ParameterizedType) getClass().getGenericSuperclass();
        Class clazz = (Class) parameterizedType.getActualTypeArguments()[0];//getActualTypeArguments()[0]:表示实际的类型参数，因为<T>（类型参数）是一个列表，T代表模型类表示第一个
        System.out.println(clazz.getSimpleName().toLowerCase());
        namespace = clazz.getSimpleName().toLowerCase();
    }

    @Override
    public void create(T t) {
        sqlSession.insert(namespace.concat(".create"),t);
    }

    @Override
    public T query(String statement, Object parameter) {
        return sqlSession.selectOne(namespace.concat(".").concat(statement),parameter);
    }

    @Override
    public List<T> queryAll() {
        return sqlSession.selectList(namespace.concat(".queryAll"));
    }

    @Override
    public T queryById(int id) {
        return sqlSession.selectOne(namespace.concat(".queryById"),id);
    }

    @Override
    public void modify(T t) {
        sqlSession.update(namespace.concat(".modify"),t);
    }

    @Override
    public void remove(int id) {
        sqlSession.delete(namespace.concat(".remove"),id);
    }
}
