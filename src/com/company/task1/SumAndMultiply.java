package com.company.task1;

public class SumAndMultiply {

  public static void main(String[] args) {
    //String[] aargs = {"5","3","1"};
    //Ввести целые числа как аргументы командной строки,
    // подсчитать их сумму (произведение) и вывести результат на консоль.
    int sum = 0;
    double multiply = 1;
    for (int i = 0; i < args.length ; i++) {
      sum = sum + Integer.parseInt(args[i]);
    }
    for (int i = 0; i < args.length; i++) {
      multiply = multiply * Integer.parseInt(args[i]);
    }
    System.out.println(sum);
    System.out.println(multiply);
  }
}
