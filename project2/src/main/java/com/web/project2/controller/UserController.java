package com.web.project2.controller;

import com.web.project2.pojo.Order;
import com.web.project2.pojo.User;
import com.web.project2.service.OrderService;
import com.web.project2.service.impl.OrderServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
public class UserController  {
    @RequestMapping("/user")
    public String user(HttpServletRequest req,HttpServletResponse res,Model model){
        OrderService orderService=new OrderServiceImpl();
        User loginUser=(User)req.getSession().getAttribute("user");
        String userId=loginUser.getUserId();
        List<Order> allOrder = orderService.showAllOrder(userId);
        model.addAttribute("allOrder",allOrder);
        return "user/user";
    }

    @RequestMapping("/logout")
    public void loginout(HttpServletRequest req, HttpServletResponse res) throws IOException {
        req.getSession().invalidate();
        res.sendRedirect("/");
    }
}
