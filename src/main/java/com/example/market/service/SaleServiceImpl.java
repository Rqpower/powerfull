package com.example.market.service;

import com.example.market.mapper.SaleMapper;
import com.example.market.pojo.Sale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleServiceImpl implements SaleService{
    @Autowired
    private SaleMapper saleMapper;
    @Override
    public int insertSale(Sale sale) {
        return saleMapper.insertSale(sale);
    }

    @Override
    public List<Sale> selectSale(Sale sale,int sort) {
        return saleMapper.selectSale(sale,sort);
    }
}
