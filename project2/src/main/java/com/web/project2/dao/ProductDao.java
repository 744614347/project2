package com.web.project2.dao;

import com.web.project2.pojo.Product;

import java.util.List;

public interface ProductDao {
    public int addProduct(Product product);
    public int updateProduct(Product product);
    public Product queryProductById(Integer id);
    public List<Product> queryProduct();
}
