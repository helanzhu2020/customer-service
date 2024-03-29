package com.example.customerservice.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@Builder
@ToString
public class OrderRequest {

  private String customer;

  private List<String> coffeeNames;
}
