package com.aci.paymentSystem.service;

import com.aci.paymentSystem.dao.h2.H2PaymentDAO;
import com.aci.paymentSystem.model.Payment;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PaymentService extends H2PaymentDAO {
    @Override
    public int create(Payment o) {
        return super.create(o);
    }

    @Override
    public void delete(Payment entity) {
        super.delete(entity);
    }

    @Override
    public Payment get(int id) {
        return super.get(id);
    }

    @Override
    public List<Payment> findAll() {
        return super.findAll();
    }
}
