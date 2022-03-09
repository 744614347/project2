package com.web.project2.service.impl;

import com.web.project2.dao.UserDao;
import com.web.project2.dao.impl.UserDaoImpl;
import com.web.project2.pojo.User;
import com.web.project2.service.UserService;

public class UserServiceImpl implements UserService {
   private UserDao userDao=new UserDaoImpl();


    @Override
    public void registUser(User user) {
        userDao.saveUser(user);

    }

    @Override
    public User login(String userId,String password) {
        return userDao.queryUserByUserIdAndPassword(userId,password);
    }

    @Override
    public boolean existUserId(String userId) {
        if(userDao.queryUserByUserId(userId)==null){
            return false;
        }
        return true;
    }
}
