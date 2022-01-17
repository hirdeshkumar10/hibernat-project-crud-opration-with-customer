package com.sunglowsys.test;

import com.sunglowsys.repository.CustomerRepository;
import com.sunglowsys.repository.CustomerRepositoryImpl;

public class TestCustomerDelete {
    public static void main(String[] args) {
        CustomerRepository customerRepository = new CustomerRepositoryImpl();
        customerRepository.delete(8L);
      //  System.out.println(new CustomerRepositoryImpl().delete(9L));
    }
}
