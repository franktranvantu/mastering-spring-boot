package com.franktran.masteringspringboot.customer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfiguration {

  @Value("${app.useFakeRepository:false}")
  private boolean useFakeRepository;

  @Bean
  public CommandLineRunner runner() {
    return args -> {
      System.out.println("Command line runner is invoked");
    };
  }

  @Bean
  public CustomerRepo customerRepo() {
    System.out.println("useFakeRepository = " + useFakeRepository);
    return useFakeRepository ? new CustomerFakeRepository() : new CustomerRepository();
  }

}
