package com.aci.paymentSystem;

import com.aci.paymentSystem.model.Biller;
import com.aci.paymentSystem.model.Customer;
import com.aci.paymentSystem.model.Payment;
import com.aci.paymentSystem.service.BillerService;
import com.aci.paymentSystem.service.CustomerService;
import com.aci.paymentSystem.service.PaymentService;

/**
 * Created by Филипп on 25.04.2018.
 */
public class DataGenerator {
    private BillerService billerService;
    private CustomerService customerService;
    private PaymentService paymentService;

    /**
     * creates fake data
     */
    public void generate() {
        /*Customer customer1 = new Customer("Filipp", "Zaripov", "30.04.1995", "Kazan");
        Customer customer2 = new Customer("Bill", "Gates", "28.10.1955", "USA");
        Customer customer3 = new Customer("Steve", "Jobs", "24.02.1955", "USA");
        Customer customer4 = new Customer("Elon", "Musk", "28.06.1971", "Canada");

        customerService.addCustomer(customer1);
        customerService.addCustomer(customer2);
        customerService.addCustomer(customer3);
        customerService.addCustomer(customer4);

        Biller biller1 = new Biller("Biller 1", "Kazan");
        Biller biller2 = new Biller("Biller 2", "Moscow");
        Biller biller3 = new Biller("The most amazing biller", "Nebeeru");

        billerService.addBiller(biller1);
        billerService.addBiller(biller2);
        billerService.addBiller(biller3);

        paymentService.addPayment(new Payment(customer1, biller1,"1234567", 1000));
        paymentService.addPayment(new Payment(customer2, biller2,"00000", 2178));
        paymentService.addPayment(new Payment(customer3, biller3,"02897123", 153241));
        paymentService.addPayment(new Payment(customer4, biller1,"350901234", 1352.50));
        paymentService.addPayment(new Payment(customer1, biller2,"00982712", 8742.46));*/

    }
}
