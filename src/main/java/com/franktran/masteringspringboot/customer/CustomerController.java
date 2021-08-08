package com.franktran.masteringspringboot.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

  private final CustomerService customerService;

  @Autowired
  public CustomerController(CustomerService customerService) {
    this.customerService = customerService;
  }

  @GetMapping
  public List<Customer> getCustomers() {
    return customerService.getCustomers();
  }

  @PostMapping
  public void createCustomer(@RequestBody Customer customer) {
    System.out.println("POST REQUEST...");
    System.out.println(customer);
  }

  @PutMapping
  public void updateCustomer(@RequestBody Customer customer) {
    System.out.println("PUT REQUEST...");
    System.out.println(customer);
  }

  @DeleteMapping("/{id}")
  public void updateCustomer(@PathVariable Long id) {
    System.out.println("DELETE REQUEST...");
    System.out.println(id);
  }

}
