package com.aci.paymentSystem.repositories;

import com.aci.paymentSystem.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Филипп on 20.04.2018.
 */

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer>{



}
