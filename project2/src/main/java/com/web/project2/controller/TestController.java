package com.web.project2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class TestController {
    @RequestMapping("/test")
    public String test(HttpServletRequest req, HttpServletResponse res){
        Cookie cookie=new Cookie("name1","value1");
        Cookie cookie1=new Cookie("name2","value2");
        res.addCookie(cookie);
        res.addCookie(cookie1);
        return "test";
    }
}
