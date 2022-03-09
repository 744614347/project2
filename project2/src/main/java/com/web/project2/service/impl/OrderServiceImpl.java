package com.web.project2.service.impl;

import com.web.project2.dao.OrderDao;
import com.web.project2.dao.impl.OrderDaoImpl;
import com.web.project2.pojo.Order;
import com.web.project2.service.OrderService;

import java.util.Date;
import java.util.List;

public class OrderServiceImpl implements OrderService {
    private OrderDao orderDao=new OrderDaoImpl();
    @Override
    public String createOrder(String userId,String orderName,Integer orderPrice,String name,String phone,String address) {
        String orderId=System.currentTimeMillis()+""+userId;
        Order order =new Order(orderId,orderName,orderPrice,userId,name,phone,address,new Date());
        orderDao.saveOrder(order);
        return orderId;
    }

    @Override
    public List<Order> showAllOrder(String userId) {
       return orderDao.queryOrdersByUserId(userId);
    }

    @Override
    public int deleteOrder(String orderId) {
        return orderDao.deleteOrderByOrderId(orderId);
    }
}
