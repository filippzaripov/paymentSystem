package com.aci.paymentSystem;

import com.aci.paymentSystem.model.Biller;
import com.aci.paymentSystem.model.Customer;
import com.aci.paymentSystem.service.BillerService;
import com.aci.paymentSystem.service.CustomerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.sql.DriverManager;
import java.util.ArrayList;

/**
 * Created by Филипп on 14.04.2018.
 */


@SpringBootApplication
public class Application {

    public static void main(String[] args) throws Exception{



         CustomerService customerService = new CustomerService();
        customerService.create(new Customer("Filipp", "Zaripov", "30.04.1995", "Kosmos"));
        /*customerService.create(new Customer("Max", "Talanov", "01.01.01", "Kazan"));
        customerService.create(new Customer("Max2", "Talanov", "01.01.01", "Kazan"));
        customerService.create(new Customer("Max3", "Talanov", "01.01.01", "Kazan"));*/

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
        SpringApplication.run(Application.class, args);

    }

   /* @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String showHelloWorld(){
        return "hello-world";
    }*/
}
