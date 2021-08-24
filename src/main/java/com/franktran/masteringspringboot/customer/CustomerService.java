package com.franktran.masteringspringboot.customer;

import com.franktran.masteringspringboot.exception.NotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class CustomerService {

  private final CustomerRepository customerRepository;

  public CustomerService(CustomerRepository customerRepository) {
    this.customerRepository = customerRepository;
  }

  public List<Customer> getCustomers() {
    return customerRepository.findAll();
  }

  public Customer getCustomerById(@PathVariable Long id) {
    return customerRepository
            .findById(id)
            .orElseThrow(() -> new NotFoundException(String.format("Customer with id %s not found", id)));
  }
}
