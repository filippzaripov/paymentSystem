package com.aci.paymentSystem.dao.h2;

import com.aci.paymentSystem.dao.AbstractDAO;
import com.aci.paymentSystem.dao.HibernateUtil;
import com.aci.paymentSystem.model.Biller;
import com.aci.paymentSystem.model.Payment;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Филипп on 19.04.2018.
 */
public class H2PaymentDAO extends AbstractDAO {
    private SessionFactory sessionFactory = HibernateUtil.buildSessionFactory();


    public int create(Payment o) {
        return super.create(o);
    }

    public void delete(Payment entity) {
        super.delete(entity);
    }

    @Override
    public Payment get(int id) {
        Session session = sessionFactory.openSession();
        Payment payment = session.get(Payment.class, id);
        session.close();
        return payment;
    }

    public List<Payment> findAll(){
        Session session = sessionFactory.openSession();
        ArrayList<Payment> paymentsList = new ArrayList();
        List list = session.createNativeQuery("SELECT id,account,amount FROM payments").list();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object[] obj = (Object[]) iterator.next();
            paymentsList.add(new Payment(Integer.parseInt(obj[0].toString()), obj[1].toString(),Double.parseDouble( obj[2].toString())));
        }
        return paymentsList;
    }
}
