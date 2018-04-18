package com.aci.paymentSystem.dao;

/**
 * Created by Филипп on 18.04.2018.
 */
public interface GenericDAO<T> {

    int create(T t);
    T get(int id);
    void delete(T t);

}
