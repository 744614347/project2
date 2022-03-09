package com.web.project2.service;

import com.web.project2.pojo.Order;
import com.web.project2.pojo.User;

import java.util.List;

public interface OrderService {
    public String createOrder(String userId,String orderName,Integer orderPrice,String name,String phone,String address);
    public List<Order> showAllOrder(String userId);
    public int deleteOrder(String orderId);

}
