package com.example.market.pojo;

import java.io.Serializable;

/**
 * 商品表(Product)实体类
 *
 * @author makejava
 * @since 2021-10-30 22:47:07
 */
public class Product implements Serializable {
    private static final long serialVersionUID = -76001484964768885L;
    /**
     * 商品id
     */
    private Integer id;
    /**
     * 商品名称
     */
    private String productname;
    /**
     * 库存量
     */
    private Integer quantity;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

}

