package com.web.project2.dao;

import com.web.project2.pojo.User;

public interface UserDao {
    /**
     * 根据用户名查询用户信息
     * @param userId
     * @return 返回null则没有
     */
    public User queryUserByUserId(String userId);

    /**
     * 保存用户信息
     * @param user
     * @return
     */
    public int saveUser(User user);

    /**
     * 根据用户名和密码查询用户信息
     * @param userId
     * @param password
     * @return 返回null则没有
     */
    public User queryUserByUserIdAndPassword(String userId,String password);


}
