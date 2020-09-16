package com.company.task3.flower;

public abstract class Flower implements Comparable<Flower> {

  public abstract double getPrice();

  public abstract String getName();

  public abstract int getStemLenght();

  public abstract boolean isFresh();

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


