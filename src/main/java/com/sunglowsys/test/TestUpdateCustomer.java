package com.sunglowsys.test;

import com.sunglowsys.domain.Customer;
import com.sunglowsys.repository.CustomerRepositoryImpl;

public class TestUpdateCustomer {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setLastName("Verma");
        new CustomerRepositoryImpl().update(customer,9L);
    }
}
