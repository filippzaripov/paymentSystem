package com.aci.paymentSystem.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "customers")
public class Customer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "fname")
    private String firstName;

    @Column(name = "lname")
    private String lastName;

    @Column(name = "birthDate")
    private String birthDate;

    @Column(name = "address")
    private String address;

    public Customer() {

    }

    public Customer(int id, String firstName, String lastName, String birthDate, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.address = address;
        this.id = id;
    }

    public Customer(String firstName, String lastName, String birthDate, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "ID: " + getId() + "\n" +
                "First Name: " + getFirstName() + "\n" +
                "Last Name: " + getLastName() + "\n" +
                "BirthDate: " + getBirthDate() + "\n" +
                "Address: " + getAddress();
    }
}
