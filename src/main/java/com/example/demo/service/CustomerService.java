package com.example.demo.service;

import com.example.demo.entity.Customer;

import java.util.List;
import java.util.Optional;

/**
 * @author gourav.mungi
 */





public interface CustomerService {

    Customer addCustomer(Customer customer);
    Optional<Customer> getCustomerById(Long id);
    Optional<Customer> getCustomerByFirstName(String firstName);
    List<Customer> getAllCustomers() ;
}
