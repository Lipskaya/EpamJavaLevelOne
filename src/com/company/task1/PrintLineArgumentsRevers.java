package com.company.task1;

import java.util.Arrays;
import java.util.Collections;

public class PrintLineArgumentsRevers {

  public static void main(String[] args) {

    //Отобразить в окне консоли аргументы командной строки в обратном порядке.
    Collections.reverse(Arrays.asList(args));
    System.out.println(Arrays.toString(args));

  }

}
