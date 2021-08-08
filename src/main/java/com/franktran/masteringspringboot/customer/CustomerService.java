package com.franktran.masteringspringboot.customer;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class CustomerService {

  private final CustomerRepo customerRepo;

  public CustomerService(CustomerRepo customerRepo) {
    this.customerRepo = customerRepo;
  }

  public List<Customer> getCustomers() {
    return customerRepo.getCustomers();
  }

  public Customer getCustomerById(@PathVariable Long id) {
    return getCustomers()
        .stream()
        .filter(customer -> customer.getId().equals(id))
        .findFirst()
        .orElseThrow(() -> new IllegalStateException("Customer not found"));
  }
}
