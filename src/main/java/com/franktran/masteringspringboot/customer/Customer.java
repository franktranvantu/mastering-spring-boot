package com.franktran.masteringspringboot.customer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.*;

public class Customer {

  private final Long id;
  @NotBlank(message = "Name must be not blank")
  private final String name;
  @NotBlank(message = "Password must be not blank")
  private final String password;
  @Email(message = "Email is invalid")
  private final String email;

  public Customer(Long id, String name, String password, String email) {
    this.id = id;
    this.name = name;
    this.password = password;
    this.email = email;
  }

  @JsonProperty("customerId")
  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  @JsonIgnore
  @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
  public String getPassword() {
    return password;
  }

  public String getEmail() {
    return email;
  }

  @Override
  public String toString() {
    return "Customer{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", password='" + password + '\'' +
            ", email='" + email + '\'' +
            '}';
  }
}
