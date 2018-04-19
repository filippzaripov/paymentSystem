package com.aci.paymentSystem.dao.h2;

import com.aci.paymentSystem.dao.CustomerDAO;
import com.aci.paymentSystem.dao.HibernateUtil;
import com.aci.paymentSystem.model.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Филипп on 18.04.2018.
 */
public class H2CustomerDAO implements CustomerDAO {

    SessionFactory sessionFactory = HibernateUtil.buildSessionFactory();

    public int create(Customer customer) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        int id = (Integer) session.save(customer);
        session.getTransaction().commit();
        session.close();
        return id;
    }

    @Override
    public Customer get(int id) {
        Session session = sessionFactory.openSession();
        Customer customer = session.get(Customer.class, id);
        session.close();
        return customer;
    }

    @Override
    public void delete(Customer customer) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(customer);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public List<Customer> findAll() {
        Session session = sessionFactory.openSession();
        ArrayList<Customer> customersList = new ArrayList();
        List list =  session.createNativeQuery("SELECT id,fname, lname, birthDate, address FROM customers").list();
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            Object[] obj = (Object[]) iterator.next();
            customersList.add(new Customer(Integer.parseInt(obj[0].toString()),obj[1].toString(),obj[2].toString(),obj[3].toString(),obj[4].toString()));
        }
        return customersList;
    }
}
