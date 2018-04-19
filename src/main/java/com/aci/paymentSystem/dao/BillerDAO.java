package com.aci.paymentSystem.dao;

import com.aci.paymentSystem.model.Biller;

import java.util.List;

public interface BillerDAO extends GenericDAO<Biller> {

    public List<Biller> findAll();
}
