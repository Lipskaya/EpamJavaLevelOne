package com.company.task1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
   // Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу.
    // Осуществить проверку корректности ввода чисел.
    if (args.length > 0){
      //String monthNumber = args[0];
      try {
        if (args[0].startsWith("0")){
          System.out.println("Не верно введен номер месяца. Номер месяца не должен начинаться с нуля." +
                  " Введи число от 1 до 12.");
          return;
        }
        int monthNumber = Integer.parseInt(args[0]);
        if (monthNumber >= 1 && monthNumber <= 12){
          System.out.println(getMonthMap().get(args[0]));
        }
        else{
          System.out.println("Не верно введен номер месяца, введи число от 1 до 12");
        }
      }
      catch (NumberFormatException e){
        System.out.println("Не верно введен номер месяца, введи число от 1 до 12");
      }

    }
    else{
      System.out.println("Не вернозаданны параметры запуска, запустите " +
              "приложение с параметрами от 1 до 12");
    }

  }
  private static Map<String,String> getMonthMap(){
    Map<String,String> result = new HashMap<>();
    result.put("1","January");
    result.put("2","February");
    result.put("3","March");
    result.put("4","April");
    result.put("5","May");
    result.put("6","June");
    result.put("7","July");
    result.put("8","August");
    result.put("9","September");
    result.put("10","Oktober");
    result.put("11","Noveber");
    result.put("12","Desember");

    return result;

  }

}
