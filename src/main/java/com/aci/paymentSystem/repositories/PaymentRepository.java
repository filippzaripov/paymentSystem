package com.aci.paymentSystem.repositories;

import com.aci.paymentSystem.model.Biller;
import com.aci.paymentSystem.model.Customer;
import com.aci.paymentSystem.model.Payment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Филипп on 22.04.2018.
 */

@Repository
public interface PaymentRepository extends CrudRepository<Payment, Integer> {

    public List<Payment> findByCustomerId(int id);

    public List<Payment> findByBillerId(int id);

}
