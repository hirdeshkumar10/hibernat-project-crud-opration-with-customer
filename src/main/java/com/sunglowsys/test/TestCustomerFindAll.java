package com.sunglowsys.test;

import com.sunglowsys.domain.Customer;
import com.sunglowsys.repository.CustomerRepositoryImpl;
import com.sunglowsys.service.ServiceCustomerImpl;

import java.util.List;

public class TestCustomerFindAll {
    public static void main(String[] args) {
        List<Customer> customerList = new CustomerRepositoryImpl().findAll();
        for (Customer customer : customerList){
            System.out.println(customer);
        }
    }
}
