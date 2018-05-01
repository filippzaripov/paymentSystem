package com.aci.paymentSystem.service;

import com.aci.paymentSystem.model.Biller;
import com.aci.paymentSystem.model.Customer;
import com.aci.paymentSystem.model.Payment;
import com.aci.paymentSystem.repositories.BillerRepository;
import com.aci.paymentSystem.repositories.CustomerRepository;
import com.aci.paymentSystem.repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private BillerRepository billerRepository;

    public List<Payment> findAll() {

        List<Payment> payments = new ArrayList<>();
        paymentRepository.findAll()
                .forEach(payments::add);
        return payments;
    }

    public List<Payment> findAllRelatedToCustomerId(int customerId){
        List<Payment> payments = new ArrayList<>();
        Customer customer = customerRepository.findById(customerId).get();
        paymentRepository.findAllByCustomer(customer).forEach(payments::add);
        return payments;
    }

    public List<Payment> findAllRelatedToBillerId(int billerId){
        List<Payment> payments = new ArrayList<>();
        Biller biller = billerRepository.findById(billerId).get();
        paymentRepository.findAllByBiller(biller).forEach(payments::add);
        return payments;
    }

    public void addPayment(Payment payment){
        paymentRepository.save(payment);
    }

    public Payment getPayment(int id){

        try{
            return paymentRepository.findById(id).get();
        }catch(Exception e){
            System.err.println("No such element in database. " + e );
        }
        return null;
    }

    public void updatePayment(Payment payment){
        paymentRepository.save(payment);
    }

    public void deletePayment(int id){
        paymentRepository.deleteById(id);
    }

}
