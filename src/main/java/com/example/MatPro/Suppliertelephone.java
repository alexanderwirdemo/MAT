package com.example.MatPro;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Suppliertelephone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer telephoneid;
    int supplierid;
    String telephonenumber;

    public Suppliertelephone() {
    }

    public Suppliertelephone(Integer telephoneid, int supplierid, String telephonenumber) {
        this.telephoneid = telephoneid;
        this.supplierid = supplierid;
        this.telephonenumber = telephonenumber;
    }

    public Integer getTelephoneid() {
        return telephoneid;
    }

    public void setTelephoneid(Integer telephoneid) {
        this.telephoneid = telephoneid;
    }

    public int getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(int supplierid) {
        this.supplierid = supplierid;
    }

    public String getTelephonenumber() {
        return telephonenumber;
    }

    public void setTelephonenumber(String telephonenumber) {
        this.telephonenumber = telephonenumber;
    }
}
