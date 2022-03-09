package com.web.project2.dao.impl;

import com.web.project2.dao.BaseDao;
import com.web.project2.dao.UserDao;
import com.web.project2.pojo.User;

public class UserDaoImpl extends BaseDao implements UserDao {

    @Override
    public User queryUserByUserId(String userId) {
        String sql="select id,userId,password,userName,phone from t_user where userId=?";
        return queryForOne(User.class,sql,userId);
    }


    @Override
    public User queryUserByUserIdAndPassword(String userId, String password) {
        String sql="select id,userId,password,userName,phone from t_user where userId=? and password=?";
        return queryForOne(User.class,sql,userId,password);
    }

    @Override
    public int saveUser(User user) {
        String sql="insert into t_user(id,userId,password,userName,phone) values(?,?,?,?,?)";
        return update(sql,user.getId(),user.getUserId(),user.getPassword(),user.getuserName(),user.getPhone());
    }

}
