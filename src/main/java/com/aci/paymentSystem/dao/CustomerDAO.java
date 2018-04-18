package com.aci.paymentSystem.dao;

import com.aci.paymentSystem.model.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by Филипп on 18.04.2018.
 */
public interface CustomerDAO extends GenericDAO<Customer> {

    public List<Customer> findAll();
}
