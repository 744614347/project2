package com.web.project2.dao.impl;

import com.web.project2.dao.BaseDao;
import com.web.project2.dao.OrderDao;
import com.web.project2.pojo.Order;

import java.util.List;

public class OrderDaoImpl extends BaseDao implements OrderDao {
    @Override
    public int saveOrder(Order order) {
        String sql="insert into t_order(orderId,orderName,orderPrice,userId,name,phone,address,createTime)values(?,?,?,?,?,?,?,?)";
        return update(sql,order.getOrderId(),order.getOrderName(),order.getOrderPrice(),order.getUserId(),order.getName(),order.getPhone(),order.getAddress(),order.getCreateTime());
    }

    @Override
    public List<Order> queryOrdersByUserId(String userId) {
        String sql="select * from t_order where userId=? ";
        return queryForList(Order.class,sql,userId);
    }

    @Override
    public int deleteOrderByOrderId(String orderId) {
        String sql="delete from t_order where orderId=?";
        return update(sql,orderId);
    }

}
