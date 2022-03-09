package com.web.project2.controller;

import com.web.project2.pojo.Product;
import com.web.project2.service.ProductService;
import com.web.project2.service.impl.ProductServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
public class IndexController {
    private ProductService productService=new ProductServiceImpl();
    @RequestMapping("/")
    public String index(Model model){
        List<Product> products = productService.queryProduct();
        model.addAttribute("products",products);
        return "index";
    }



    @RequestMapping("/filter")
    public String filter(HttpServletResponse res) throws IOException {
       return "filter/filter";
    }




}
