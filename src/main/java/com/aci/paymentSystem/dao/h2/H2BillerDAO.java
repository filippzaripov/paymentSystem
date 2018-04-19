package com.aci.paymentSystem.dao.h2;

import com.aci.paymentSystem.dao.AbstractDAO;
import com.aci.paymentSystem.dao.HibernateUtil;
import com.aci.paymentSystem.model.Biller;
import com.aci.paymentSystem.model.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class H2BillerDAO extends AbstractDAO {

    SessionFactory sessionFactory = HibernateUtil.buildSessionFactory();

    public List<Biller> findAll() {
        Session session = sessionFactory.openSession();
        ArrayList<Biller> billersList = new ArrayList();
        List list = session.createNativeQuery("SELECT id,name,address FROM billers").list();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object[] obj = (Object[]) iterator.next();
            billersList.add(new Biller(Integer.parseInt(obj[0].toString()), obj[1].toString(), obj[2].toString()));
        }
        return billersList;
    }

    public int create(Biller biller) {
        return super.create(biller);
    }

    public Biller get(int id) {
        Session session = sessionFactory.openSession();
        Biller biller = session.get(Biller.class, id);
        session.close();
        return biller;
    }

    public void delete(Biller biller) {
        super.delete(biller);
    }
}
