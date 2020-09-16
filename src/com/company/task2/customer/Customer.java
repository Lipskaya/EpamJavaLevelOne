package com.company.task2.customer;

public class Customer {
// id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки, Номер банковского счета.
  private int id;
  private String name;
  private String surname;
  private String secondName;
  private String address;
  private int numberOfCard;
  private String IBAN;// Internetional bank account number

  public Customer() {
  }

  public Customer(int id, String name, String surname, String secondName, String address,
      int numberOfCard, String IBAN) {
    this.id = id;
    this.name = name;
    this.surname = surname;
    this.secondName = secondName;
    this.address = address;
    this.numberOfCard = numberOfCard;
    this.IBAN = IBAN;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public String getSecondName() {
    return secondName;
  }

  public void setSecondName(String secondName) {
    this.secondName = secondName;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public int getNumberOfCard() {
    return numberOfCard;
  }

  public void setNumberOfCard(int numberOfCard) {
    this.numberOfCard = numberOfCard;
  }

  public String getIBAN() {
    return IBAN;
  }

  public void setIBAN(String IBAN) {
    this.IBAN = IBAN;
  }

  @Override
  public String toString() {
    return "Customer{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", surname='" + surname + '\'' +
        ", secondName='" + secondName + '\'' +
        ", address='" + address + '\'' +
        ", numberOfCard=" + numberOfCard +
        ", IBAN='" + IBAN + '\'' +
        '}';
  }
}
