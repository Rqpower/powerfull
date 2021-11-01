package com.example.market.service;

import com.example.market.pojo.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductService {
    public List<Product> selectPro(@Param("pro") Product product);
    public int update(Product product);
    public Product selectPro1(Product product);
}
