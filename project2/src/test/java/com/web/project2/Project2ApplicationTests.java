package com.web.project2;


import com.alibaba.druid.pool.DruidDataSource;
import com.web.project2.util.JdbcUtil;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;


@SpringBootTest

class Project2ApplicationTests {
    @Autowired
    public  DataSource dataSource;

    @Test
    public void contextLoads() throws SQLException {
        System.out.println(JdbcUtil.getconnection());

    }

}
