package com.franktran.masteringspringboot.customer;

import java.util.Arrays;
import java.util.List;

public class CustomerFakeRepository implements CustomerRepo {

  @Override
  public List<Customer> getCustomers() {
    return Arrays.asList(
        new Customer(1L, "Frank", "frank123"),
        new Customer(2L, "Henry", "henry123"),
        new Customer(3L, "Bean", "bean123")
    );
  }

}
