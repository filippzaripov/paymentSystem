package com.aci.paymentSystem.web;

import com.aci.paymentSystem.model.Biller;
import com.aci.paymentSystem.service.BillerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Филипп on 22.04.2018.
 */
@CrossOrigin(origins = "http://locahost:4200", allowedHeaders = "*")
@RestController
public class BillerController {

    @Autowired
    private BillerService billerService;

    @GetMapping("/billers")
    public List<Biller> findAll(){
        return billerService.findAll();
    }

    @RequestMapping(value = "/billers", method = RequestMethod.POST)
    public void addBiller(@RequestBody Biller biller){
        billerService.addBiller(biller);
    }

    @RequestMapping("/billers/{id}")
    public Biller getBiller(@PathVariable int id){
        return billerService.getBiller(id);
    }

    @RequestMapping(value = "/billers/{id}",method = RequestMethod.PUT)
    public void updateBiller(@RequestBody Biller biller, @PathVariable int id){
        biller.setId(id);
        billerService.updateBiller(biller);
    }

    @RequestMapping(method=RequestMethod.DELETE, value = "/billers/{id}")
    public void deleteBiller(@PathVariable int id){
        billerService.deleteBiller(id);
    }
}
