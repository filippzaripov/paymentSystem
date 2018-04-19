package com.aci.paymentSystem.model;

import javax.persistence.*;

/**
 * Created by Филипп on 14.04.2018.
 */
@Entity
@Table(name = "payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "customerId")
    private String customerId;

    @Column(name = "billerId")
    private String billerId;

    @Column(name = "account")
    private String account;

    @Column(name = "amount")
    private double amount;

    public Payment() {
    }

    public Payment(int id, String customerId, String billerId, String account, double amount) {
        this.customerId = customerId;
        this.billerId = billerId;
        this.account = account;
        this.amount = amount;
        this.id = id;
    }

    public Payment(String customerId, String billerId, String account, double amount) {
        this.customerId = customerId;
        this.billerId = billerId;
        this.account = account;
        this.amount = amount;

    }


    public long getId() {
        return id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getBillerId() {
        return billerId;
    }

    public void setBillerId(String billerId) {
        this.billerId = billerId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
