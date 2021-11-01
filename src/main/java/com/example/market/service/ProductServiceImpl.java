package com.example.market.service;

import com.example.market.mapper.ProductMapper;
import com.example.market.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductMapper productMapper;
    @Override
    public List<Product> selectPro(Product product) {
        return productMapper.selectPro(product);
    }

    @Override
    public int update(Product product) {
        return productMapper.update(product);
    }

    @Override
    public Product selectPro1(Product product) {
        return productMapper.selectPro1(product);
    }
}
