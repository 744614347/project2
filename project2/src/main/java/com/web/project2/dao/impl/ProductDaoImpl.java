package com.web.project2.dao.impl;

import com.web.project2.dao.BaseDao;
import com.web.project2.dao.ProductDao;
import com.web.project2.pojo.Product;

import java.util.List;

public class ProductDaoImpl extends BaseDao implements ProductDao {
    @Override
    public int addProduct(Product product) {
        String sql="insert into t_product(name,price,img) values(?,?,?)";
        return update(sql,product.getName(),product.getPrice(),product.getImg());
    }

    @Override
    public int updateProduct(Product product) {
        String sql="update t_product set name=?,price=?,img=? where id=?";
        return update(sql,product.getName(),product.getPrice(),product.getImg(),product.getId());
    }

    @Override
    public Product queryProductById(Integer id) {
        String sql="select id,name,price,img from t_product where id=?";
        return queryForOne(Product.class,sql,id);
    }

    @Override
    public List<Product> queryProduct() {
        String sql="select id,name,price,img from t_product";
        return queryForList(Product.class,sql);
    }
}
