package com.web.project2.dao;

import com.web.project2.util.JdbcUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public abstract class BaseDao {
    private QueryRunner queryRunner=new QueryRunner();

    public int update(String sql,Object ...args){
        Connection connection= new JdbcUtil().getconnection();
        try {
           return queryRunner.update(connection,sql,args);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**返回一个javabean
     *
     * @param type 返回的对象类型
     * @param sql  执行的sql语句
     * @param args  sql对应的参数
     * @Param <T>  返回的类型的泛型
     * @return
     */
    public <T> T queryForOne(Class<T> type,String sql,Object ...args){
        Connection connection=JdbcUtil.getconnection();
        try {
            return queryRunner.query(connection,sql,new BeanHandler<T>(type),args);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }

    public <T> List<T> queryForList(Class<T> type, String sql, Object ...args){
        Connection connection=JdbcUtil.getconnection();
        try {
            return queryRunner.query(connection,sql,new BeanListHandler<T>(type),args);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }

    public Object queryForStringValues(String sql,Object ...args){
        Connection connection=JdbcUtil.getconnection();
        try {
            return queryRunner.query(connection,sql,new ScalarHandler(),args);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }
}
