package com.aci.paymentSystem.web;

import com.aci.paymentSystem.model.Payment;
import com.aci.paymentSystem.service.BillerService;
import com.aci.paymentSystem.service.CustomerService;
import com.aci.paymentSystem.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Autowired
    private CustomerService customerService;

    @Autowired
    private BillerService billerService;

    @GetMapping("/payments")
    public List<Payment> findAll() {
        return paymentService.findAll();
    }

    @RequestMapping(value = "/payments", method = RequestMethod.POST)
    public void addPayment(@RequestBody Payment payment, @RequestParam("customer_id") int customerId, @RequestParam("biller_id") int billerId) {
        payment.setCustomer(customerService.getCustomer(customerId));
        payment.setBiller(billerService.getBiller(billerId));
        paymentService.addPayment(payment);
    }

    @RequestMapping("/payments/{id}")
    public Payment getPayment(@PathVariable int id) {
        return paymentService.getPayment(id);
    }

    @RequestMapping(value = "/payments/{id}", method = RequestMethod.PUT)
    public void updatePayment(@RequestBody Payment payment, @PathVariable int id) {
        payment.setId(id);
        paymentService.updatePayment(payment);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/payments/{id}")
    public void deletePayment(@PathVariable int id) {
        paymentService.deletePayment(id);
    }
}
