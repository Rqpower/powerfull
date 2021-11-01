package com.example.market.mapper;

import com.example.market.pojo.Sale;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SaleMapper {
    public int insertSale(Sale sale);
    public List<Sale>selectSale(@Param("sale")Sale sale,int sort);
}
