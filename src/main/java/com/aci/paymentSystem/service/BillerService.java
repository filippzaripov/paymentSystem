package com.aci.paymentSystem.service;

import com.aci.paymentSystem.dao.h2.H2BillerDAO;
import com.aci.paymentSystem.model.Biller;

import java.util.ArrayList;
import java.util.List;

public class BillerService extends H2BillerDAO {
    @Override
    public ArrayList<Biller> findAll() {
        return (ArrayList)super.findAll();
    }

    @Override
    public int create(Biller biller) {
        return super.create(biller);
    }

    @Override
    public Biller get(int id) {
        return super.get(id);
    }

    @Override
    public void delete(Biller biller) {
        super.delete(biller);
    }
}
