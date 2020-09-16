package com.company.task3.accessories;

public class Paper extends Accessory {

  private String name = "Decor paper";
  private double price = 2.5;

  @Override
  public String getName() {
    return name;
  }

  @Override
  public double getPrice() {
    return price;
  }
}
