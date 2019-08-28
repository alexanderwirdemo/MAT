package com.example.MatPro;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Paymentinfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer paymentid;
    String Customertype;
    String Bank;
    String Account;
    String SwishNumber;
    String terms;

    public Paymentinfo() {
    }

    public Paymentinfo(Integer paymentid, String customertype, String bank, String account, String swishNumber, String terms) {
        this.paymentid = paymentid;
        Customertype = customertype;
        Bank = bank;
        Account = account;
        SwishNumber = swishNumber;
        this.terms = terms;
    }

    public Integer getPaymentid() {
        return paymentid;
    }

    public void setPaymentid(Integer paymentid) {
        this.paymentid = paymentid;
    }

    public String getCustomertype() {
        return Customertype;
    }

    public void setCustomertype(String customertype) {
        Customertype = customertype;
    }

    public String getBank() {
        return Bank;
    }

    public void setBank(String bank) {
        Bank = bank;
    }

    public String getAccount() {
        return Account;
    }

    public void setAccount(String account) {
        Account = account;
    }

    public String getSwishNumber() {
        return SwishNumber;
    }

    public void setSwishNumber(String swishNumber) {
        SwishNumber = swishNumber;
    }

    public String getTerms() {
        return terms;
    }

    public void setTerms(String terms) {
        this.terms = terms;
    }
}
