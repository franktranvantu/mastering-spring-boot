package com.franktran.masteringspringboot.customer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

  @GetMapping
  public Customer getCustomer() {
    Customer frank = new Customer(1L, "Frank");
    return frank;
  }

}
