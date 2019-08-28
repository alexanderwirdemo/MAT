package com.example.MatPro;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer customerid;
    int paymentinfo;
    String name;
    int shippingaddressid;
    int customeraddressid;
    int telephoneid;

    public Customer() {
    }

    public Customer(Integer customerid, int paymentinfo, String name, int shippingaddressid, int customeraddressid, int telephoneid) {
        this.customerid = customerid;
        this.paymentinfo = paymentinfo;
        this.name = name;
        this.shippingaddressid = shippingaddressid;
        this.customeraddressid = customeraddressid;
        this.telephoneid = telephoneid;
    }

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public int getPaymentinfo() {
        return paymentinfo;
    }

    public void setPaymentinfo(int paymentinfo) {
        this.paymentinfo = paymentinfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getShippingaddressid() {
        return shippingaddressid;
    }

    public void setShippingaddressid(int shippingaddressid) {
        this.shippingaddressid = shippingaddressid;
    }

    public int getCustomeraddressid() {
        return customeraddressid;
    }

    public void setCustomeraddressid(int customeraddressid) {
        this.customeraddressid = customeraddressid;
    }

    public int getTelephoneid() {
        return telephoneid;
    }

    public void setTelephoneid(int telephoneid) {
        this.telephoneid = telephoneid;
    }
}

