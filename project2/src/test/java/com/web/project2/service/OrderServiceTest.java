package com.web.project2.service;

import com.web.project2.service.impl.OrderServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {
    private OrderService orderService=new OrderServiceImpl();

    @Test
    void createOrder() {
        System.out.println(orderService.createOrder("admin","保姆服务",30,"admin","123456","aaaa"));
    }

    @Test
    void showAllOrder() {
        System.out.println(orderService.showAllOrder("admin"));
    }
}