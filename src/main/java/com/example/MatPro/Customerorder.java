package com.example.MatPro;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Customerorder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer orderid;
    int customerid;
    Date date;
    float freight;

    public Customerorder(Integer orderid, int customerid, Date date, float freight) {
        this.orderid = orderid;
        this.customerid = customerid;
        this.date = date;
        this.freight = freight;
    }

    public Customerorder() {
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getFreight() {
        return freight;
    }

    public void setFreight(float freight) {
        this.freight = freight;
    }
}
