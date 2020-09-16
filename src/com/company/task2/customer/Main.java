package com.company.task2.customer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Main {


  public static void main(String[] args) {
    //Создать массив объектов.
    Customer[] customers = new Customer[10];

    Customer customer = new Customer();
    customer.setId(1);
    customer.setName("Irina");
    customer.setSecondName("Ivanovna");
    customer.setSurname("Ivanova");
    customer.setAddress("Gomel");
    customer.setNumberOfCard(123);
    customer.setIBAN("113 345");
    customers[0] = customer;

    Customer customer1 = new Customer();
    customer1.setId(2);
    customer1.setName("Ilona");
    customer1.setSecondName("Petrovna");
    customer1.setSurname("Ivanova");
    customer1.setAddress("Gomel");
    customer1.setNumberOfCard(113);
    customer1.setIBAN("113 346");
    customers[1] = customer1;

    Customer customer2 = new Customer();
    customer2.setId(2);
    customer2.setName("Andrey");
    customer2.setSecondName("Ivanovich");
    customer2.setSurname("Petrov");
    customer2.setAddress("Brest");
    customer2.setNumberOfCard(423);
    customer2.setIBAN("113 348");
    customers[2] = customer2;

    Customer customer3 = new Customer();
    customer3.setId(3);
    customer3.setName("Alex");
    customer3.setSecondName("Ivanovich");
    customer3.setSurname("Belkin");
    customer3.setAddress("Grodno");
    customer3.setNumberOfCard(523);
    customer3.setIBAN("113 546");
    customers[3] = customer3;

    System.out.println("до сортировки ");
    List<Customer> c = Arrays.asList(customers);
    c.forEach(x -> System.out.println(x));

    System.out.println("после сортировки ");
    List<Customer> sortedCustomersList = getSortCustomers(customers);
    sortedCustomersList.forEach(x -> System.out.println(x));

    System.out.println("список покупателей у которых номер кредитной карточки находится в заданном интервале");
    List<Customer> customerList = getCustomersCardNumberInterval(customers,100,200);
    customerList.forEach(x -> System.out.println(x));
  }

  // Вывести:
  // a) список покупателей в алфавитном порядке;
  public static List<Customer> getSortCustomers(Customer[] customers) {
    List<Customer> rezalt = Arrays.asList(customers);
    rezalt = rezalt.stream()//преобразуем лист в стрим
        .filter(Objects::nonNull)// отфильтровываем список без нулевых элементов
        .sorted(Comparator.comparing(Customer::getSurname))//сортируем по фамилии
        .collect(Collectors.toList());//собираем stream в лист
    return rezalt;
  }

  // Вывести:
  // b) список покупателей, у которых номер кредитной карточки находится в заданном интервале.
  public static List<Customer> getCustomersCardNumberInterval(Customer[] customers, int start,
      int end) {
    List<Customer> rezalt = new ArrayList<Customer>();
    for (int i = 0; i < customers.length; i++) {
      Customer c = customers[i];//достаем кастомера как i элемент массива
      if (c!=null && start <= c.getNumberOfCard() && end >= c.getNumberOfCard()) {
        rezalt.add(c);
      }
    }
    return rezalt;
  }

}