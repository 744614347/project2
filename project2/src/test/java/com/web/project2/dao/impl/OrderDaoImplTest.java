package com.web.project2.dao.impl;

import com.web.project2.dao.OrderDao;
import com.web.project2.pojo.Order;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class OrderDaoImplTest {
    private OrderDao orderDao=new OrderDaoImpl();

    @Test
    void saveOrder() {
    }

    @Test
    void queryOrdersByUserId() {
        System.out.println(orderDao.queryOrdersByUserId("admin"));
    }
}