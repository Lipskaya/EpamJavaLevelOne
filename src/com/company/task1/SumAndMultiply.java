package com.company.task1;

public class SumAndMultiply {

  public static void main(String[] args) {
    //String[] args = {"5","3","1"};
    //Ввести целые числа как аргументы командной строки,
    // подсчитать их сумму (произведение) и вывести результат на консоль.
    if (args.length > 1){
      try {
        int sum = 0;
        double multiplication = 1;
        for (int i = 0; i < args.length ; i++) {

          sum += Integer.parseInt(args[i]);
        }
        for (int i = 0; i < args.length; i++) {
          multiplication *= Integer.parseInt(args[i]);
        }
        System.out.println("Сумма = " + sum);
        System.out.println("Произведение = " + multiplication);
      }
      catch (NumberFormatException e){
        System.out.println("Параметры запуска заданны не верно. " +
                "Допустимы только целочисленные аргументы");
      }
    }
    else {
      System.out.println("Неверное количество параметров, задайте хотя бы " +
              "два целочисленных значения");
    }

  }
}
