package com.company.task3.flower;

public class Flower implements Comparable<Flower> {
  public enum FlowerType {
    CHAMOMILE,
    CHRYSANTHEMUM,
    HYDRANGEA,
    ROSE
  }
  private FlowerType name;
  private double price;
  private int stemlenght;
  private boolean isFresh;

  public void setName(FlowerType name) {
    this.name = name;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void setStemlenght(int stemlenght) {
    this.stemlenght = stemlenght;
  }

  public void setFresh(boolean fresh) {
    isFresh = fresh;
  }

  public double getPrice() {
    return price;
  }


  public String getName() {
    return name.toString();
  }


  public int getStemLenght() {
    return stemlenght;
  }


  public boolean isFresh() {
    return isFresh;
  }

  public int compareTo(Flower flower) {

    if (this.isFresh() == flower.isFresh()) {
      return 0;
    } else if (this.isFresh() == true) {
      return -1;
    } else {
      return 1;
    }
  }
  @Override
  public String toString() {
    return "Flower{" +
        "name='" + getName() + '\'' +
        ", price=" + getPrice() +
        ", stemlenght=" + getStemLenght() +
        ", "
        + "isFresh=" + isFresh() +
        '}';
  }
}


