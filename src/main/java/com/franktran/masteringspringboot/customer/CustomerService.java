package com.franktran.masteringspringboot.customer;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerService {

  private final CustomerRepo customerRepo;

  public CustomerService(CustomerRepo customerRepo) {
    this.customerRepo = customerRepo;
  }

  public List<Customer> getCustomers() {
    return customerRepo.getCustomers();
  }

}
