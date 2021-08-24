package com.franktran.masteringspringboot.customer;

import java.util.Arrays;
import java.util.List;

public class CustomerFakeRepository implements CustomerRepo {

  @Override
  public List<Customer> getCustomers() {
    return Arrays.asList(
        new Customer(1L, "Frank", "frank123", "frank@gmail.com"),
        new Customer(2L, "Henry", "henry123", "henry@gmail.com"),
        new Customer(3L, "Bean", "bean123", "bean@gmail.com")
    );
  }

}
