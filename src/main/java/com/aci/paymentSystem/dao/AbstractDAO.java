package com.aci.paymentSystem.dao;


import com.aci.paymentSystem.model.Biller;
import com.aci.paymentSystem.model.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public abstract class AbstractDAO implements GenericDAO{

    SessionFactory sessionFactory = HibernateUtil.buildSessionFactory();

   @Override
    public int create(Object o) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        int id = (int) session.save(o);
        session.getTransaction().commit();
        session.close();
        return id;
    }


    /*public Object get(int id, Object o) {
        Session session = sessionFactory.openSession();
        Object object = session.get(o.getClass(), id);
        session.close();
        return object;
    }*/

    public void delete(Object entity) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(entity);
        session.getTransaction().commit();
        session.close();
    }
}
