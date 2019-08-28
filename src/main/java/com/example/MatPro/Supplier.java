package com.example.MatPro;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String supplierid;
    int paymentinfo;
    String name;
    int shippingaddressid;
    int corporateaddressid;
    int telephoneid;

    public Supplier() {
    }

    public Supplier(String supplierid, int paymentinfo, String name, int shippingaddressid, int corporateaddressid, int telephoneid) {
        this.supplierid = supplierid;
        this.paymentinfo = paymentinfo;
        this.name = name;
        this.shippingaddressid = shippingaddressid;
        this.corporateaddressid = corporateaddressid;
        this.telephoneid = telephoneid;
    }

    public String getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(String supplierid) {
        this.supplierid = supplierid;
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

    public int getCorporateaddressid() {
        return corporateaddressid;
    }

    public void setCorporateaddressid(int corporateaddressid) {
        this.corporateaddressid = corporateaddressid;
    }

    public int getTelephoneid() {
        return telephoneid;
    }

    public void setTelephoneid(int telephoneid) {
        this.telephoneid = telephoneid;
    }
}
