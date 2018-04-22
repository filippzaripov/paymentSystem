package com.aci.paymentSystem.service;

import com.aci.paymentSystem.model.Biller;
import com.aci.paymentSystem.repositories.BillerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BillerService {
    @Autowired
    private BillerRepository billerRepository;

    public List<Biller> findAll() {

        List<Biller> billers = new ArrayList<>();
        billerRepository.findAll()
                .forEach(billers::add);
        return billers;
    }

    public void addBiller(Biller biller){
        billerRepository.save(biller);
    }

    public Biller getBiller(int id){

        try{
            return billerRepository.findById(id).get();
        }catch(Exception e){
            System.err.println("No such element in database. " + e );
        }
        return null;
    }

    public void updateBiller(Biller biller){
        billerRepository.save(biller);
    }

    public void deleteBiller(int id){
        billerRepository.deleteById(id);
    }
}
