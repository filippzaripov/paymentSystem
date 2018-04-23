package com.aci.paymentSystem.service;

import com.aci.paymentSystem.model.Payment;
import com.aci.paymentSystem.repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    public List<Payment> findAll() {

        List<Payment> payments = new ArrayList<>();
        paymentRepository.findAll()
                .forEach(payments::add);
        return payments;
    }

    public List<Payment> findAllRelatedToCustomerId(int customerId){
        List<Payment> payments = new ArrayList<>();
        paymentRepository.findByCustomerId(customerId).forEach(payments::add);
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
