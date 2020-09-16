package com.company.task3.accessories;

public class Tape extends Accessory {

  private String name = "Decorative tape";
  private double price = 0.5;

  @Override
  public String getName() {
    return name;
  }

  @Override
  public double getPrice() {
    return price;
  }
}
