package com.franktran.masteringspringboot.customer;

import com.franktran.masteringspringboot.exception.NotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class CustomerService {

  private static final Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);

  private final CustomerRepository customerRepository;

  public CustomerService(CustomerRepository customerRepository) {
    this.customerRepository = customerRepository;
  }

  public List<Customer> getCustomers() {
    LOGGER.info("getCustomers() was called.");
    return customerRepository.findAll();
  }

  public Customer getCustomerById(@PathVariable Long id) {
    return customerRepository
            .findById(id)
            .orElseThrow(() -> {
              NotFoundException notFoundException = new NotFoundException(String.format("Customer with id %s not found", id));
              LOGGER.error(notFoundException.getMessage());
              return notFoundException;
            });
  }
}
