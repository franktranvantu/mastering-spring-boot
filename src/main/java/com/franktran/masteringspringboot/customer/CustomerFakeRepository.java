package com.franktran.masteringspringboot.customer;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component("fake")
public class CustomerFakeRepository implements CustomerRepo {

  @Override
  public List<Customer> getCustomers() {
    return Arrays.asList(
        new Customer(1L, "Frank"),
        new Customer(2L, "Henry"),
        new Customer(3L, "Bean")
    );
  }

}
