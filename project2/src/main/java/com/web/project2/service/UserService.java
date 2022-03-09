package com.web.project2.service;

import com.web.project2.pojo.User;

public interface UserService {
    public void registUser(User user);

    public User login(String userId,String password);

    public boolean existUserId(String userId);

}
