package com.web.project2.dao;

import com.web.project2.dao.impl.ProductDaoImpl;
import com.web.project2.pojo.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductDaoTest {
    private ProductDao productDao=new ProductDaoImpl();
    @Test
    void addProduct(){
        productDao.addProduct(new Product(null,"家政",20,null));
    }

    @Test
    void updataProduct() {
        productDao.updateProduct(new Product(2,"保姆",20,null));
    }

    @Test
    void queryProductById() {
        System.out.println(productDao.queryProductById(1));
    }

    @Test
    void queryProduct() {
        for (Product product : productDao.queryProduct()) {
            System.out.println(product);
        }
    }
}