package com.franktran.masteringspringboot.customer;

import org.springframework.stereotype.Component;

@Component
public class CustomerService {

  public Customer getCustomer() {
    Customer frank = new Customer(1L, "Frank");
    return frank;
  }

}
