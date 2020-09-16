package com.company.task3.bouquet;

import com.company.task3.accessories.Accessory;
import com.company.task3.flower.Flower;
import java.util.ArrayList;
import java.util.List;

public class Bouquet {

  private List<Flower> flowers = new ArrayList<Flower>();
  private List<Accessory> accessories = new ArrayList<Accessory>();

  public List<Flower> getFlowers() {
    return flowers;
  }

  public double getPrice() {
    double result = 0.0;
    for (Flower flower : flowers) {
      result = result + flower.getPrice();
    }
    for (Accessory accessory : accessories) {
      result = result + accessory.getPrice();
    }
    return result;
  }

  public void addFlower(Flower flower) {
    flowers.add(flower);
  }

  public void addAccessory(Accessory accessory) {
    accessories.add(accessory);
  }

  public List<Flower> getFilteredSteamFlowersList(int minSteamLenght, int maxSteamLenght) {
    List<Flower> result = new ArrayList<Flower>();
    for (Flower flower : flowers) {
      if (flower.getStemLenght() > minSteamLenght && flower.getStemLenght() < maxSteamLenght) {
        result.add(flower);
      }

    }
    return result;
  }
}
