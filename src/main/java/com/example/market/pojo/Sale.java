package com.example.market.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * 销售记录表(Sale)实体类
 *
 * @author makejava
 * @since 2021-10-30 22:47:21
 */
public class Sale implements Serializable {
    private static final long serialVersionUID = -52406457858635946L;
    /**
     * 记录id
     */
    private Integer id;
    /**
     * 销售单价
     */
    private Double price;
    /**
     * 数量
     */
    private Integer quantity;
    /**
     * 总价
     */
    private Double totalprice;
    /**
     * 销售日期
     */
    private Date saledate;
    /**
     * 商品id
     */
    private Integer productid;
    /**
     * 销售名称
     */
 private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(Double totalprice) {
        this.totalprice = totalprice;
    }

    public Date getSaledate() {
        return saledate;
    }

    public void setSaledate(Date saledate) {
        this.saledate = saledate;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "id=" + id +
                ", price=" + price +
                ", quantity=" + quantity +
                ", totalprice=" + totalprice +
                ", saledate=" + saledate +
                ", productid=" + productid +
                ", name='" + name + '\'' +
                '}';
    }
}

