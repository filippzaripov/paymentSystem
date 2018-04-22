package com.aci.paymentSystem.repositories;

import com.aci.paymentSystem.model.Payment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Филипп on 22.04.2018.
 */

@Repository
public interface PaymentRepository extends CrudRepository<Payment, Integer> {
}
