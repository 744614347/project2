package com.web.project2.test;

import com.web.project2.pojo.User;
import com.web.project2.service.UserService;
import com.web.project2.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceImplTest {
    UserService userService=new UserServiceImpl();
    @Test
    void registUser() {
        userService.registUser(new User(null,"bbj169","bbj169","666666","987654321"));
    }

    @Test
    void login() {
        System.out.println(userService.login("bbj168","666666"));
    }

    @Test
    void existUsername() {
        if(userService.existUserId("aaa")){
            System.out.println("exist");
        }
        else {
            System.out.println("no exist");
        }
    }
}