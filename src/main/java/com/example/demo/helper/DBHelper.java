package com.example.demo.helper;

import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 * @author gourav.mungi
 */

@Component
public class DBHelper {

    @Autowired
    private CustomerRepository customerRepository;


    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }


    public Optional<Customer> getCustomerById(Long id) {
        return customerRepository.findById(id);
    }


    public Optional<Customer> getCustomerByFirstName(String firstName) {
        return customerRepository.findByFirstName(firstName);
    }


    public List<Customer> findAll() {

      return  customerRepository.findAll();
    }
}
