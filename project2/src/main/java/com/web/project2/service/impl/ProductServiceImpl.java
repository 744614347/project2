package com.web.project2.service.impl;

import com.web.project2.dao.ProductDao;
import com.web.project2.dao.impl.ProductDaoImpl;
import com.web.project2.pojo.Product;
import com.web.project2.service.ProductService;

import java.util.List;

public class ProductServiceImpl implements ProductService {
    private ProductDao productDao=new ProductDaoImpl();
    @Override
    public void addProduct(Product product) {
        productDao.addProduct(product);
    }

    @Override
    public void updateProduct(Product product) {
        productDao.updateProduct(product);
    }

    @Override
    public Product queryProductById(Integer id) {
        return productDao.queryProductById(id);
    }

    @Override
    public List<Product> queryProduct() {
        return productDao.queryProduct();
    }
}
