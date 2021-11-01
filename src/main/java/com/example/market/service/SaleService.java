package com.example.market.service;

import com.example.market.pojo.Sale;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SaleService {
    public int insertSale(Sale sale);
    public List<Sale> selectSale(@Param("sale")Sale sale,int sort);
}
