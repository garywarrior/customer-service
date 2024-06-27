package com.example.demo;

import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.springframework.mock.http.server.reactive.MockServerHttpRequest.*;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class CustomerApplicationTests {

    @Autowired
    private CustomerRepository customerRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void testAddAndRetrieveCustomer() {
        Customer customer = new Customer();
        customer.setFirstName("Alice");
        customer.setLastName("Smith");
        customer.setDob(LocalDate.of(2000, 1, 1));

        customerRepository.save(customer);

        Customer retrievedCustomer = customerRepository.findByFirstName("Alice").orElse(null);
        assertThat(retrievedCustomer).isNotNull();
        assertThat(retrievedCustomer.getFirstName()).isEqualTo("Alice");
    }
}
