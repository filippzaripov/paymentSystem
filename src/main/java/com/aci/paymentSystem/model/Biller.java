package com.aci.paymentSystem.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "billers")
public class Biller {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    public Biller() {

    }

    public Biller(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Biller(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "ID: " + getId() + "\n"+
                "Name: " + getName() + "\n"+
                "Address: " + getAddress();
    }

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Payment> paymentSet;
}
