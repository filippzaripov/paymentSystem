package com.aci.paymentSystem.dao;

import com.aci.paymentSystem.model.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class App {

    public static void main(String[] args) throws SQLException {

        ResultSet rs;
        SQLiteTest test = new SQLiteTest();
        rs = test.displayUsers();
        /*while (rs.next()) {
            System.out.println(rs.getString("fname") + " " + rs.getString("lname"));
        }*/
        Date date = new Date();

        Customer customer = new Customer("Filipp", "Zaripov", "30.04.1995", "Kosmonavtov st.");
        SessionFactory sessionFactory = buildSessionFactory(Customer.class);
        Session session = sessionFactory.openSession();
        session.save(customer);
        Customer savedCustomer = session.get(Customer.class, 1);
        System.out.println("____________________");
        System.out.println("First name: " + savedCustomer.getFirstName());
        System.out.println("Last name: " + savedCustomer.getLastName());
        System.out.println("____________________");
        session.close();
        sessionFactory.close();
    }

    private static SessionFactory buildSessionFactory(Class clazz) {
        return new Configuration()
                .configure()
                .addAnnotatedClass(clazz)
                .buildSessionFactory();
    }
}
