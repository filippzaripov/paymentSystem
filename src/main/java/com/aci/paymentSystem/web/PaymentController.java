package com.aci.paymentSystem.web;

import com.aci.paymentSystem.model.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @RequestMapping
    public List<Payment> getListOfPayments(){
        return paymentService.findAll();
    }

    @RequestMapping("/1")
    public Payment getOne(){

        return paymentService.findOne(1);
    }
}