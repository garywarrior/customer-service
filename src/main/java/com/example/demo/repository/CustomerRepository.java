package com.example.demo.repository;

import com.example.demo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.Optional;

/**
 * @author gourav.mungi
 */


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Optional<Customer> findByFirstName(String firstName);
}
