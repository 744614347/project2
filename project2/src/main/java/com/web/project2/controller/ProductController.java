package com.web.project2.controller;

import com.web.project2.pojo.Product;
import com.web.project2.service.ProductService;
import com.web.project2.service.impl.ProductServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class ProductController {

    private ProductService productService=new ProductServiceImpl();

    @RequestMapping("/product1")
    public String product1(HttpServletRequest req, HttpServletResponse res,Model model){
        Product product1 = productService.queryProductById(1);
        Integer price1=product1.getPrice();
        String name1=product1.getName();
        model.addAttribute("price1",price1);
        model.addAttribute("name1",name1);
        req.getSession().setAttribute("orderName",name1);
        req.getSession().setAttribute("orderPrice",price1);
        return "/product/product1";
    }



    @RequestMapping("/product2")
    public String product2(HttpServletRequest req, HttpServletResponse res,Model model){
        Product product2 = productService.queryProductById(2);
        Integer price2=product2.getPrice();
        String name2=product2.getName();
        model.addAttribute("price2",price2);
        model.addAttribute("name2",name2);
        req.getSession().setAttribute("orderName",name2);
        req.getSession().setAttribute("orderPrice",price2);
        return "/product/product2";
    }


}
