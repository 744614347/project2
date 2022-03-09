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
import java.io.IOException;

import static com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY;

@Controller
public class RegisterController {
    private UserService userService = new UserServiceImpl();

    @RequestMapping("/register")
    public String register() {
        return "/register/register";
    }

    @PostMapping("/checkRegister")
    public String register(HttpServletRequest req, HttpServletResponse res, Model model) throws Exception {
        String userId = req.getParameter("userId");
        String userName = req.getParameter("userName");
        String phone = req.getParameter("phone");
        String password = req.getParameter("password");
        String token = (String) req.getSession().getAttribute(KAPTCHA_SESSION_KEY);
        req.getSession().removeAttribute(KAPTCHA_SESSION_KEY);
        String code = req.getParameter("code");

//        if(userService.existUserId(userId)){
//            model.addAttribute("errorMsg","该用户已存在");
//            model.addAttribute("userName",userName);
//            model.addAttribute("phone",phone);
//            return "/register/register";
//
//        }else{
        if (token != null && token.equalsIgnoreCase(code)) {
            Integer id = null;
            userService.registUser(new User(id, userId, password, userName, phone));
            res.sendRedirect("/login");
            return null;
        } else {
            model.addAttribute("errorCode", "验证码错误");
            return "/register/register";
        }

    }

    @RequestMapping("/checkUserId")
    public void checkUserId(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html;charset=UTF-8");
        String userId = req.getParameter("userId");
        if (userService.existUserId(userId)) {
            res.getWriter().write("该用户已存在");
        }
    }


}
