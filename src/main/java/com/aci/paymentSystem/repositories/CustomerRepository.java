package com.aci.paymentSystem.repositories;

import com.aci.paymentSystem.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

/**
 * Created by Филипп on 20.04.2018.
 */

@Repository
@CrossOrigin(origins = "http://localhost:4200")
public interface CustomerRepository extends CrudRepository<Customer, Integer>{



}
