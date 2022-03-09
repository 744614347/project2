package com.web.project2.service;

import com.web.project2.pojo.Product;

import java.util.List;

public interface ProductService {
    public void addProduct(Product product);
    public  void updateProduct(Product product);
    public Product queryProductById(Integer id);
    public List<Product> queryProduct();
}
