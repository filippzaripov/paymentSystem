package com.aci.paymentSystem.model;

/**
 * Created by Филипп on 14.04.2018.
 */
public class Payment {
    private long id;
    private String customer;
    private String biller;
    private String account;
    private double amount;

    public Payment(long id, String customer, String biller, String account, double amount) {
        this.customer = customer;
        this.biller = biller;
        this.account = account;
        this.amount = amount;
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getBiller() {
        return biller;
    }

    public void setBiller(String biller) {
        this.biller = biller;
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
}
