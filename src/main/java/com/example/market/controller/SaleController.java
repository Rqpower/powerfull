package com.example.market.controller;

import com.example.market.pojo.Product;
import com.example.market.pojo.Sale;
import com.example.market.service.ProductService;
import com.example.market.service.SaleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
public class SaleController {
    @Autowired
    private SaleService saleService;
    @Autowired
    private ProductService productService;
    @RequestMapping("show")
    public Object show(){
        return "show";
    }
    //添加销售记录
    @RequestMapping("addSale")
    @ResponseBody
    public Object addSale(Sale sale){
        sale.setTotalprice(sale.getPrice()*sale.getQuantity());
        sale.setSaledate(new Date());
        int productid=sale.getProductid();
        Product product=new Product();
        product.setId(productid);
        product=productService.selectPro1(product);
        System.out.println(product);
         int count=product.getQuantity()-sale.getQuantity();
        System.out.println("----------"+count);
         product.setQuantity(count);
         if(count<0){
             return "no";
         }else {
             saleService.insertSale(sale);
             productService.update(product);
             return "ok";
         }
    }
    //查找商品
    @RequestMapping("getPro")
    @ResponseBody
    public List<Product> getPro(Product product){
        System.out.println(product);
        return productService.selectPro(product);
    }
    //查找销售记录
    @RequestMapping("getSale")
    @ResponseBody
    public Object getSale(Sale sale, @RequestParam(defaultValue = "1")int pageNo,@RequestParam(defaultValue = "5")int pageSize,int sort){
        PageHelper.offsetPage((pageNo-1)* pageSize, pageSize);
        List<Sale> list=saleService.selectSale(sale,sort);
        PageInfo<Sale> pageInfo=new PageInfo<Sale> (list);
        return pageInfo;
    }
}
