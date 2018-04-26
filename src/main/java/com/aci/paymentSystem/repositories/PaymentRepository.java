package com.aci.paymentSystem.repositories;

import com.aci.paymentSystem.model.Biller;
import com.aci.paymentSystem.model.Customer;
import com.aci.paymentSystem.model.Payment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

/**
 * Created by Филипп on 22.04.2018.
 */

@Repository
@CrossOrigin(origins = "http://localhost:4200")
public interface PaymentRepository extends CrudRepository<Payment, Integer> {

    public List<Payment> findByCustomerId(int topicId);

    public List<Payment> findByBiller(Biller biller);

}
