package com.aci.paymentSystem.dao;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * Created by Филипп on 17.04.2018.
 */
public class HibernateUtil {

    public static SessionFactory buildSessionFactory() {
        return new Configuration()
                .configure()
                .buildSessionFactory();
    }
}
