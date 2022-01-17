package com.sunglowsys.test;

import com.sunglowsys.repository.CustomerRepositoryImpl;

public class TestCustomerFindById {
    public static void main(String[] args) {
        System.out.println(new CustomerRepositoryImpl().findById(9L));
    }
}
