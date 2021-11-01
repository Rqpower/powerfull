package com.example.market.mapper;

import com.example.market.pojo.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductMapper {
    public List<Product>selectPro(@Param("pro") Product product);
    public int update(Product product);
    public Product selectPro1(Product product);
}
