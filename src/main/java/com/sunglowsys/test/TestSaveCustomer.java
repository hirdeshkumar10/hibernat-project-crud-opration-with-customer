package com.sunglowsys.test;

import com.sunglowsys.domain.Customer;
import com.sunglowsys.service.ServiceCustomer;
import com.sunglowsys.service.ServiceCustomerImpl;

public class TestSaveCustomer {
    public static void main(String[] args) {

        Customer customer = new Customer("Surendra","Singh","ss@gmail.com","9064576899");
        new ServiceCustomerImpl().save(customer);

    }
}
