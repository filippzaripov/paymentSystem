package com.aci.paymentSystem.web;

import com.aci.paymentSystem.model.Customer;
import com.aci.paymentSystem.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Филипп on 21.04.2018.
 */
@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers")
    public List<Customer> findAll(){
        return customerService.findAll();
    }

    @RequestMapping(value = "/customers", method = RequestMethod.POST)
    public void addCustomer(@RequestBody Customer customer){
        customerService.addCustomer(customer);
    }

    @RequestMapping("/customers/{id}")
    public Customer getCustomer(@PathVariable int id){
        return customerService.getCustomer(id);
    }

    @RequestMapping(value = "/customers/{id}",method = RequestMethod.PUT)
    public void updateCustomer(@RequestBody Customer customer, @PathVariable int id){
        customer.setId(id);
        customerService.updateCustomer(customer);
    }

    @RequestMapping(method=RequestMethod.DELETE, value = "/customers/{id}")
    public void deleteCustomer(@PathVariable int id){
        customerService.deleteCustomer(id);
    }
}
