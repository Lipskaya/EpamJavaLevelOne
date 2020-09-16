package com.company.task3.flower;

public class Chamomile extends Flower {

  private String name = "Chamomile";
  private double price = 1.0;
  private int stemlenght = 25;
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
