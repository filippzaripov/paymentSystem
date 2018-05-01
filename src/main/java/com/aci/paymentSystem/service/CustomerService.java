package com.aci.paymentSystem.service;

import com.aci.paymentSystem.model.Customer;
import com.aci.paymentSystem.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> findAll() {

        List<Customer> customers = new ArrayList<>();
        customerRepository.findAll()
                .forEach(customers::add);
        return customers;
    }

    public Customer addCustomer(Customer customer){
        return customerRepository.save(customer);

    }

    public Customer getCustomer(int id){

        try{
            return customerRepository.findById(id).get();
        }catch(Exception e){
            System.err.println("No such element in database. " + e );
        }
        return null;
    }

    public void updateCustomer(Customer customer){
        customerRepository.save(customer);
    }

    public void deleteCustomer(int id){
        customerRepository.deleteById(id);
    }
}
