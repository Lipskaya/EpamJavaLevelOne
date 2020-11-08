package com.company.task1;

import java.util.Random;

public class PrintRandomNumbers {

  public static void main(String[] args) {

    if(args.length == 0){
      System.out.println("Параметры запуска заданы не верно");
      System.out.println("В следующий раз задайте желаемое количество случайных чисел " +
              "в параметрах запуска приложения");
    }
    else {
      try{
        String number = args[0];
        int intNumber = Integer.parseInt(number);

        int[] randomNumbers = new int[intNumber];

        for (int i = 0; i < intNumber; i++) {
          randomNumbers[i] = new Random().nextInt(10);

        }
        //Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
        System.out.println("выводим случайные числа в строку");
        for (int i = 0; i < randomNumbers.length; i++) {
          System.out.print(randomNumbers[i] + " ");
        }
        System.out.println();
        System.out.println("выводим случайные числа в столбик");

        for (int i = 0; i < randomNumbers.length; i++) {
          System.out.println(randomNumbers[i]);
        }
      }
      catch (NumberFormatException e){
        System.out.println("Некорректный ввод, введите целое число");
      }
      catch (NegativeArraySizeException e){
        System.out.println("Некорректный ввод, введите целое положительное число");
      }

    }

  }
}
