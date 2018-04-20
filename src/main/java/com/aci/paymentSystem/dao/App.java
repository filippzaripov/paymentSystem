package com.aci.paymentSystem.dao;

import com.aci.paymentSystem.dao.h2.H2CustomerDAO;
import com.aci.paymentSystem.model.Customer;
import com.aci.paymentSystem.service.CustomerService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.sql.SQLException;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) throws SQLException {
        /*SessionFactory sessionFactory = HibernateUtil.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.save(new Customer("Filipp", "Zaripov", "30.04.1995", "Kosmos"));
*/
        CustomerService customerService = new CustomerService();
        H2CustomerDAO customerDAO = new H2CustomerDAO();
        //customerDAO.create(new Customer("Filipp", "Zaripov", "30.04.1995", "Kosmos"));
        customerService.create(new Customer("Filipp", "Zaripov", "30.04.1995", "Kosmos"));



        ArrayList<Customer> list = customerService.findAll();

        for (Customer customer : list) {
            System.out.println(customer.toString());
        }

       /* BillerService billerService = new BillerService();
        billerService.create(new Biller("Biller 1", "Kazan, Russia"));
        billerService.create(new Biller("Biller 2", "Kazan, Russia"));
        billerService.create(new Biller("Biller 3", "Kazan, Russia"));

        ArrayList<Biller> billers = billerService.findAll();
        System.out.println("-------------------");
        for (Biller localBiller : billers){
            System.out.println(localBiller.toString());
            System.out.println("-------------------");

        }*/


    }

}
