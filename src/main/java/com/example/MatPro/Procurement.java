package com.example.MatPro;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Procurement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer producrementid;
    String supplierid;
    Date date;
    float freight;

    public Procurement() {
    }

    public Procurement(Integer producrementid, String supplierid, Date date, float freight) {
        this.producrementid = producrementid;
        this.supplierid = supplierid;
        this.date = date;
        this.freight = freight;
    }

    public Integer getProducrementid() {
        return producrementid;
    }

    public void setProducrementid(Integer producrementid) {
        this.producrementid = producrementid;
    }

    public String getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(String supplierid) {
        this.supplierid = supplierid;
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
