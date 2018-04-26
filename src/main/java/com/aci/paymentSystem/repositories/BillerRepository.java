package com.aci.paymentSystem.repositories;

import com.aci.paymentSystem.model.Biller;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * Created by Филипп on 22.04.2018.
 */
@Repository
@CrossOrigin(origins = "http://localhost:4200")
public interface BillerRepository extends CrudRepository<Biller, Integer> {
}
