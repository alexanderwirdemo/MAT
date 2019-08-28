package com.example.MatPro;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
public class Product {

//    @Autowired
//    private Product repository;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer productno;

    String name;
    String category;
    float price;

    float purchaseprice;

    int stockquantity;


    public Product(Integer productNo, String name, String category, float price, float purchasePrice, int stockQuantity) {
        this.productno = productNo;
        this.name = name;
        this.category = category;
        this.price = price;
        this.purchaseprice = purchasePrice;
        this.stockquantity = stockQuantity;
    }

    public Product(String name, String category, float price, float purchasePrice) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.purchaseprice = purchasePrice;
    }

    public Product() {
    }

    public Integer getProductno() {
        return productno;
    }

    public void setProductno(Integer productno) {
        this.productno = productno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPurchaseprice() {
        return purchaseprice;
    }

    public void setPurchaseprice(float purchaseprice) {
        this.purchaseprice = purchaseprice;
    }

    public int getStockquantity() {
        return stockquantity;
    }

    public void setStockquantity(int stockquantity) {
        this.stockquantity = stockquantity;
    }
}
