package com.aci.paymentSystem.service;

import com.aci.paymentSystem.dao.h2.H2CustomerDAO;
import com.aci.paymentSystem.model.Customer;

import java.util.ArrayList;

public class CustomerService extends H2CustomerDAO {

    @Override
    public int create(Customer customer) {
        return super.create(customer);
    }

    @Override
    public Customer get(int id) {
        return super.get(id);
    }

    @Override
    public void delete(Customer customer) {
        super.delete(customer);
    }

    @Override
    public ArrayList<Customer> findAll() {
        return (ArrayList) super.findAll();
    }
}
