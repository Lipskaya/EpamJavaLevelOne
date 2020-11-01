package com.company.task3;

import com.company.task3.accessories.Net;
import com.company.task3.accessories.Paper;
import com.company.task3.accessories.Tape;
import com.company.task3.bouquet.Bouquet;
import com.company.task3.flower.Flower;
import java.util.Collections;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    // write your code here

    Bouquet bouquet = new Bouquet();
    bouquet.addFlower(getChamomile());
    bouquet.addFlower(getRose());
    bouquet.addFlower(getChrysanthemum());
    bouquet.addFlower(getHydrangea());
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
    int minLength = 10;
    int maxLength = 35;
    List<Flower> flowerSteam = bouquet.getFilteredSteamFlowersList(minLength,maxLength);
    for (int i = 0; i < flowerSteam.size(); i++) {
      System.out.println(flowerSteam.get(i));

    }
  }
  private static Flower getChamomile(){
    Flower result = new Flower();
    result.setFresh(false);
    result.setName(Flower.FlowerType.CHAMOMILE);
    result.setPrice(1.0);
    result.setStemlenght(25);

    return result;
  }

  private static Flower getHydrangea(){
    Flower result = new Flower();
    result.setFresh(true);
    result.setName(Flower.FlowerType.HYDRANGEA);
    result.setPrice(5.5);
    result.setStemlenght(35);

    return result;
  }
  private static Flower getChrysanthemum(){

    Flower result = new Flower();
    result.setFresh(false);
    result.setName(Flower.FlowerType.CHRYSANTHEMUM);
    result.setPrice(2.0);
    result.setStemlenght(30);

    return result;
  }
  private static Flower getRose(){

    Flower result = new Flower();
    result.setFresh(true);
    result.setName(Flower.FlowerType.ROSE);
    result.setPrice(3.5);
    result.setStemlenght(45);

    return result;
  }
}
