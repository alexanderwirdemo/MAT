package com.example.MatPro;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customertelephone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer telephoneid;
    int customerid;
    String telephonenumber;

    public Customertelephone() {
    }

    public Customertelephone(Integer telephoneid, int customerid, String telephonenumber) {
        this.telephoneid = telephoneid;
        this.customerid = customerid;
        this.telephonenumber = telephonenumber;
    }

    public Integer getTelephoneid() {
        return telephoneid;
    }

    public void setTelephoneid(Integer telephoneid) {
        this.telephoneid = telephoneid;
    }

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public String getTelephonenumber() {
        return telephonenumber;
    }

    public void setTelephonenumber(String telephonenumber) {
        this.telephonenumber = telephonenumber;
    }
}
