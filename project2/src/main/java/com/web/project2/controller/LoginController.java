package com.web.project2.controller;

import com.web.project2.pojo.User;
import com.web.project2.service.UserService;
import com.web.project2.service.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class LoginController {

    private UserService userService=new UserServiceImpl();

    @RequestMapping("/login")
    public String login() {
        return "/login/login";
    }

    @PostMapping("/checkLogin")
    public String checklogin(HttpServletRequest req, HttpServletResponse res, Model model) throws Exception {
        User loginUser=userService.login(req.getParameter("userId"),req.getParameter("password"));
        if(loginUser==null){
            model.addAttribute("errorMsg","用户名或密码错误");
            model.addAttribute("userId",req.getParameter("userId"));
            return "login/login";
        }else {
            req.getSession().setAttribute("user",loginUser);
            res.sendRedirect("/user");
            return null;
        }
    }

}
