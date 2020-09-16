package com.company.task3.flower;

public class Hydrangea extends Flower {

  private String name = "Hydrangea";
  private double price = 5.5;
  private int stemlenght = 35;
  private boolean isFresh = true;

  @Override
  public double getPrice() {
    return price;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public int getStemLenght() {
    return stemlenght;
  }

  @Override
  public boolean isFresh() {
    return isFresh;
  }
}
