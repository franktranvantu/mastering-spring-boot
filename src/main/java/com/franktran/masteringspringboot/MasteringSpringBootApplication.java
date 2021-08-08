package com.franktran.masteringspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MasteringSpringBootApplication {

  public static void main(String[] args) {
    SpringApplication.run(MasteringSpringBootApplication.class, args);
  }

  @GetMapping
  public Customer getCustomer() {
    Customer frank = new Customer(1L, "Frank");
    return frank;
  }

  class Customer {

    private final Long id;
    private final String name;

    public Customer(Long id, String name) {
      this.id = id;
      this.name = name;
    }

    public Long getId() {
      return id;
    }

    public String getName() {
      return name;
    }
  }

}
