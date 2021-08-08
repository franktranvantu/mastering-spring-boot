package com.franktran.masteringspringboot.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/v2")
public class CustomerControllerV2 {

  private final CustomerService customerService;

  @Autowired
  public CustomerControllerV2(CustomerService customerService) {
    this.customerService = customerService;
  }

  @GetMapping
  public List<Customer> getCustomers() {
    return Collections.singletonList(new Customer(1L, "Frank", "frank123"));
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
