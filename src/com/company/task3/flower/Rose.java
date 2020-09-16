package com.company.task3.flower;

public class Rose extends Flower {

  private String name = "Rose";
  private double price = 3.5;
  private int stemlenght = 45;
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
