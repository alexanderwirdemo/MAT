package com.example.MatPro;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Procurementhasproduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer producrementproduct;
    int procurementid;
    int productno;
    int quantity;
    float priceadjustment;
    float vat;

    public Procurementhasproduct() {
    }

    public Procurementhasproduct(Integer producrementproduct, int procurementid, int productno, int quantity, float priceadjustment, float vat) {
        this.producrementproduct = producrementproduct;
        this.procurementid = procurementid;
        this.productno = productno;
        this.quantity = quantity;
        this.priceadjustment = priceadjustment;
        this.vat = vat;
    }

    public Integer getProducrementproduct() {
        return producrementproduct;
    }

    public void setProducrementproduct(Integer producrementproduct) {
        this.producrementproduct = producrementproduct;
    }

    public int getProcurementid() {
        return procurementid;
    }

    public void setProcurementid(int procurementid) {
        this.procurementid = procurementid;
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
        this.quantity = quantity;
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
