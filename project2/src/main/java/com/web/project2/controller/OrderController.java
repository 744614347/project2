package com.web.project2.controller;

import com.web.project2.pojo.User;
import com.web.project2.service.OrderService;
import com.web.project2.service.impl.OrderServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class OrderController {
   private OrderService orderService=new OrderServiceImpl();
    @RequestMapping("/order")
    public String order(){
        return "order/order";
    }

    @GetMapping("/orderUser")
    public void orderUser(HttpServletRequest req, HttpServletResponse res, Model model) throws IOException {
        User loginUser = (User)req.getSession().getAttribute("user");
        String userId=loginUser.getUserId();
        String orderName = (String) req.getSession().getAttribute("orderName");
        Integer orderPrice = (Integer) req.getSession().getAttribute("orderPrice");
        String name=req.getParameter("name");
        String phone=req.getParameter("phone");
        String address=req.getParameter("address");
        orderService.createOrder(userId,orderName,orderPrice,name,phone,address);
        res.sendRedirect("/user");
    }
    @RequestMapping("/deleteOrder")
    public void deleteOrder(HttpServletRequest req,HttpServletResponse res) throws IOException {
        String orderId = req.getParameter("orderId");
        orderService.deleteOrder(orderId);
        res.sendRedirect("/user");
    }
}
