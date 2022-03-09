package com.web.project2.service;

import com.web.project2.pojo.Product;
import com.web.project2.service.impl.ProductServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductServiceTest {
    private ProductService productService=new ProductServiceImpl();

    @Test
    void addProduct() {

    }

    @Test
    void updateProduct() {
    }

    @Test
    void queryProductById() {
        System.out.println(productService.queryProductById(1));
    }

    @Test
    void queryProduct() {
        System.out.println(productService.queryProduct());
    }
}