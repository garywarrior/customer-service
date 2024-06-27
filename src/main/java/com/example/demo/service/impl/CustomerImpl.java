package com.example.demo.service.impl;

import com.example.demo.entity.Customer;
import com.example.demo.helper.DBHelper;
import com.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 * @author gourav.mungi
 */


@Component
public class CustomerImpl implements CustomerService {

    @Autowired
    private DBHelper dbHelper;


    @Override
    public Customer addCustomer(Customer customer) {
        return dbHelper.addCustomer(customer);
    }

    @Override
    public Optional<Customer> getCustomerById(Long id) {
        return dbHelper.getCustomerById(id);
    }

    @Override
    public Optional<Customer> getCustomerByFirstName(String firstName) {
        return dbHelper.getCustomerByFirstName(firstName);
    }

    public List<Customer> getAllCustomers() {
        return dbHelper.findAll();
    }
}
