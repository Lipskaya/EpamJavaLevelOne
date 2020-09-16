package com.company.task3;

import com.company.task3.accessories.Net;
import com.company.task3.accessories.Paper;
import com.company.task3.accessories.Tape;
import com.company.task3.bouquet.Bouquet;
import com.company.task3.flower.Chamomile;
import com.company.task3.flower.Chrysanthemum;
import com.company.task3.flower.Flower;
import com.company.task3.flower.Hydrangea;
import com.company.task3.flower.Rose;
import java.util.Collections;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    // write your code here

    Bouquet bouquet = new Bouquet();
    bouquet.addFlower(new Chamomile());
    bouquet.addFlower(new Rose());
    bouquet.addFlower(new Chrysanthemum());
    bouquet.addFlower(new Hydrangea());
    bouquet.addAccessory(new Net());
    bouquet.addAccessory(new Paper());
    bouquet.addAccessory(new Tape());
    System.out.println("Стоимость букета:" + bouquet.getPrice());
    System.out.println();

    List<Flower> flowers = bouquet.getFlowers();
    Collections.sort(flowers);
    System.out.println("Букет состоит из цветов сортированных по свежести:");
    for(int i = 0; i < flowers.size(); i++) {
      System.out.print(flowers.get(i) + "\n");
    }
    System.out.println();
    System.out.println("В букете содержатся цветы с диапазоном длины стебля от 10 до 35");
    List<Flower> flowerSteam = bouquet.getFilteredSteamFlowersList(10,35);
    for (int i = 0; i < flowerSteam.size(); i++) {
      System.out.println(flowerSteam.get(i));

    }
  }
}
