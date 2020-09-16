package com.company.task3.accessories;

public class Net extends Accessory {

  private String name = "Decorative net";
  private double price = 1.5;

  @Override
  public String getName() {
    return name;
  }

  @Override
  public double getPrice() {
    return price;
  }
}
