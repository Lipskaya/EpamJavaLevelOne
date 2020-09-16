package com.company.task1;

public class PrintRandomNumbers {

  public static void main(String[] args) {
    //Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
    int abc[] = {3, 6, 8, 9, 3, 23};
    for (int i = 0; i < abc.length; i++) {
      System.out.print(abc[i]);
    }
    for (int i = 0; i < abc.length; i++) {
      System.out.println(abc[i]);
    }
  }
}
