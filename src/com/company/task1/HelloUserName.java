package com.company.task1;

import java.util.Scanner;

public class HelloUserName {

  public static void main(String[] args) {

    //Приветствовать любого пользователя при вводе его имени через командную строку.

    if (args.length == 0){
      System.out.println("Параметры запуска заданы неверно");
      System.out.println("В следующий раз задайте имя пользователь в параметрах запуска");

      System.out.println("Введите имя пользователя");
      Scanner sc = new Scanner(System.in);
      String name = sc.nextLine();
      System.out.println("Hello " + name + "! (from scanner)");
    }
    else {
      String name = args[0];
      System.out.println("Hello " + name + "! (from command line arguments)");
    }

  }

}
