package com.sunglowsys.repository;

import com.sunglowsys.domain.Customer;
import com.sunglowsys.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository{

    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    @Override
    public Customer save(Customer customer) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Long id = (Long) session.save(customer);
        session.close();
        Customer result = session.get(Customer.class, id);
        return result;
    }

    @Override
    public Customer update(Customer customer,Long id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Customer customer1 = session.get(Customer.class,id);
        customer1.setLastName(customer.getLastName());
        session.update(customer1);
        session.getTransaction().commit();
        session.close();
        System.out.println("Updated......");
        return customer1;
    }

    @Override
    public Customer findById(Long id) {
        Session session = sessionFactory.openSession();
        Customer customer = session.get(Customer.class,id);
        return customer;
    }

    @Override
    public List<Customer> findAll() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("from Customer");
        List<Customer> customerList = query.list();
        return customerList;
    }

    @Override
    public void delete(Long id) {
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            Customer customer = session.get(Customer.class,id);
            session.delete(customer);
            session.getTransaction().commit();
            session.close();
            System.out.println("Record has been deleted successfully on this id: " + id);

    }
}
