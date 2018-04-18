package com.aci.paymentSystem.dao;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * Created by Филипп on 17.04.2018.
 */
public class HibernateUtil {

    private static SessionFactory sessionFactory = null;
    private Class clazz;

    private HibernateUtil(Class clazz) {
        Configuration cfg = new Configuration().addAnnotatedClass(clazz).configure();
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                .applySettings(cfg.getProperties());
        this.clazz = clazz;
        sessionFactory = cfg.buildSessionFactory(builder.build());
    }

    public static SessionFactory getSessionFactory(Class clazz) {
        if (sessionFactory == null) {

            return new HibernateUtil(clazz).sessionFactory;
        } else {
            return sessionFactory;
        }

    }

    public static void shutdown() {
        if (sessionFactory != null) {
            sessionFactory.close();
        }
    }
    /*private static SessionFactory buildSessionFactory(Class clazz) {
        return new Configuration()
                .configure()
                .addAnnotatedClass(clazz)
                .buildSessionFactory();
    }*/
}
