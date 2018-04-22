package com.aci.paymentSystem.dao.h2;

import com.aci.paymentSystem.dao.AbstractDAO;
import com.aci.paymentSystem.dao.HibernateUtil;
import com.aci.paymentSystem.model.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Филипп on 18.04.2018.
 */

public class H2CustomerDAO extends AbstractDAO {

    SessionFactory sessionFactory = HibernateUtil.buildSessionFactory();

    public int create(Customer customer) {
        return super.create(customer);

    }

    @Override
    public Customer get(int id) {
        Session session = sessionFactory.openSession();
        Customer customer = (Customer) session.get(Customer.class, id);
        session.close();
        return customer;
    }


    public void delete(Customer customer) {
        super.delete(customer);
    }

    /*public List<Customer> findAll() {
        Session session = sessionFactory.openSession();
        ArrayList<Customer> customersList = new ArrayList();
        List list = session.createNativeQuery("SELECT customer_id,fname, lname, birthDate, address FROM customers").list();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object[] obj = (Object[]) iterator.next();
            customersList.add(new Customer(Integer.parseInt(obj[0].toString()), obj[1].toString(), obj[2].toString(), obj[3].toString(), obj[4].toString()));
        }
        return customersList;
    }*/
}
