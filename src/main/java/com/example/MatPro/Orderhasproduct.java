package com.example.MatPro;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Orderhasproduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer orderproduct;
    int oderid;
    int productno;
    int quantity;
    float priceadjustment;
    float vat;

    public Orderhasproduct() { }

    public Orderhasproduct(Integer orderproduct, int oderid, int productno, int quantity, float priceadjustment, float vat) {
        this.orderproduct = orderproduct;
        this.oderid = oderid;
        this.productno = productno;
        this.quantity = quantity;
        this.priceadjustment = priceadjustment;
        this.vat = vat;
    }

    public Integer getOrderproduct() {
        return orderproduct;
    }

    public void setOrderproduct(Integer orderproduct) {
        this.orderproduct = orderproduct;
    }

    public int getOrderid() {
        return oderid;
    }

    public void setOrderid(int orderid) {
        this.oderid = orderid;
    }

    public int getProductno() {
        return productno;
    }

    public void setProductno(int productno) {
        this.productno = productno;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        quantity = quantity;
    }

    public float getPriceadjustment() {
        return priceadjustment;
    }

    public void setPriceadjustment(float priceadjustment) {
        this.priceadjustment = priceadjustment;
    }

    public float getVat() {
        return vat;
    }

    public void setVat(float vat) {
        this.vat = vat;
    }
}
