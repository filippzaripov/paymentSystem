package com.aci.paymentSystem.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Created by Филипп on 17.04.2018.
 */
public class HibernateUtil {

    public static SessionFactory buildSessionFactory() {

        try{

            return new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        }catch (Throwable ex){
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw  new ExceptionInInitializerError(ex);
        }

       /* return new Configuration()
                .configure()
                .buildSessionFactory();*/
    }
}
