package com.web.project2.dao;

import com.web.project2.pojo.Order;

import java.util.List;

public interface  OrderDao {
    public int saveOrder(Order order);
    public List<Order> queryOrdersByUserId(String userId);
    public int deleteOrderByOrderId(String orderId);
}
