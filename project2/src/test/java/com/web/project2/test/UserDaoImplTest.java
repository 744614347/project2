package com.web.project2.test;

import com.web.project2.dao.UserDao;
import com.web.project2.dao.impl.UserDaoImpl;
import com.web.project2.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class UserDaoImplTest {
    UserDao userDao=new UserDaoImpl();


    @Test
    void queryUserByUsername() {
        if(userDao.queryUserByUserId("admin")==null){
            System.out.println("用户名不存在");
        }else {
            System.out.println("用户名已存在");
        }
    }


    @Test
    void queryUserByUsernameAndPassword() {
        if(userDao.queryUserByUserIdAndPassword("admin","123456")==null){
            System.out.println("用户名或密码错误，登录失败");
        }else {
            System.out.println("查询成功");
        }
    }

    @Test
    void saveUser() {
        System.out.println(userDao.saveUser(new User(null,"aaa","123456","121212","abc")));
    }
}