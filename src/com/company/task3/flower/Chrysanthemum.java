package com.company.task3.flower;

public class Chrysanthemum extends Flower {

  private String name = "Chrysanthemum";
  private double price = 2.0;
  private int stemlenght = 30;
  private boolean isFresh = false;


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
