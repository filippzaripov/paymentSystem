package com.aci.paymentSystem.dao.sqlite;

import com.aci.paymentSystem.dao.CustomerDAO;
import com.aci.paymentSystem.dao.HibernateUtil;
import com.aci.paymentSystem.model.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

/**
 * Created by Филипп on 18.04.2018.
 */
public class SQLiteCustomerDAO implements CustomerDAO {

    SessionFactory sessionFactory = HibernateUtil.getSessionFactory(Customer.class);

    public int create(Customer customer) {
        Session session = sessionFactory.openSession();
        int id = (Integer) session.save(customer);
        session.close();
        HibernateUtil.shutdown();
        return id;
    }

    @Override
    public Customer get(int id) {
        Session session = sessionFactory.openSession();
        Customer customer = session.get(Customer.class, id);
        session.close();
        HibernateUtil.shutdown();
        return customer;
    }

    @Override
    public void delete(Customer customer) {
        Session session = sessionFactory.openSession();
        session.delete(customer);
        session.close();
        HibernateUtil.shutdown();
    }

    @Override
    public List<Customer> findAll() {
        Session session = sessionFactory.openSession();
        List list = session.createQuery("from customers").list();
        HibernateUtil.shutdown();
        return null;
    }
}
