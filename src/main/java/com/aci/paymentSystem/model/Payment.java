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
    private int id;

    @Column(name = "account")
    private String account;

    @Column(name = "amount")
    private double amount;

    public Payment() {
    }

    public Payment(int id, String account, double amount) {

        this.account = account;
        this.amount = amount;
        this.id = id;
    }

    public Payment(String account, double amount) {

        this.account = account;
        this.amount = amount;

    }

    public Payment(Customer customer, Biller biller, String account, double amount) {
        this.account = account;
        this.amount = amount;
        //this.customer = customer;
        this.biller = biller;
    }


    public long getId() {
        return id;
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

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @ManyToOne
    private Biller biller;

    public Biller getBiller() {
        return biller;
    }

    public void setBiller(Biller biller) {
        this.biller = biller;
    }
}
