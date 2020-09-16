package com.company.task1;

import java.util.Scanner;

public class HelloUserName {

  public static void main(String[] args) {

    //Приветствовать любого пользователя при вводе его имени через командную строку.

    System.out.println("Введите имя пользователя");
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    System.out.println("Hello " + name + "!");
  }

}
