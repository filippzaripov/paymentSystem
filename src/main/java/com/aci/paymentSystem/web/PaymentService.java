package com.aci.paymentSystem.web;

import com.aci.paymentSystem.model.Payment;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PaymentService {
    private static List<Payment> items = new ArrayList<>();

    public static void init(){
        items.add(new Payment(1,"Filipp", "Biller", "Filipps Account", 100));
        items.add(new Payment(2,"Filipp1", "Biller", "Filipps Account", 200));
        items.add(new Payment(3,"Filipp2", "Biller", "Filipps Account", 130));
        items.add(new Payment(4,"Filipp3", "Biller", "Filipps Account", 1045));
        items.add(new Payment(5,"Filipp4", "Biller", "Filipps Account", 11230));
        items.add(new Payment(6,"Filipp5", "Biller", "Filipps Account", 1022));
        items.add(new Payment(7,"Filipp6", "Biller", "Filipps Account", 1020));
        items.add(new Payment(8,"Filipp7", "Biller", "Filipps Account", 101110));
    }

    public List<Payment> findAll() {
        return items;
    }
}
