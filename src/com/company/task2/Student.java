package com.company.task2;

import java.util.Date;

public class Student {

  // id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон, Факультет, Курс, Группа
  private int id;
  private String name;
  private String secondName;
  private String lastName;
  private Date dateOfBirth;
  private String adress;
  private int phoneNamber;
  private String faculty;
  private int course;
  private int group;

  public Student(int id, String name, String secondName, String lastName, Date dateOfBirth,
      String adress, int phoneNamber, String faculty, int course, int group) {
    this.id = id;
    this.name = name;
    this.secondName = secondName;
    this.lastName = lastName;
    this.dateOfBirth = dateOfBirth;
    this.adress = adress;
    this.phoneNamber = phoneNamber;
    this.faculty = faculty;
    this.course = course;
    this.group = group;
  }

//  public Student() {
//  }

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

  public String getSecondName() {
    return secondName;
  }

  public void setSecondName(String secondName) {
    this.secondName = secondName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Date getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public String getAdress() {
    return adress;
  }

  public void setAdress(String adress) {
    this.adress = adress;
  }

  public int getPhoneNamber() {
    return phoneNamber;
  }

  public void setPhoneNamber(int phoneNamber) {
    this.phoneNamber = phoneNamber;
  }

  public String getFaculty() {
    return faculty;
  }

  public void setFaculty(String faculty) {
    this.faculty = faculty;
  }

  public int getCourse() {
    return course;
  }

  public void setCourse(int course) {
    this.course = course;
  }

  public int getGroup() {
    return group;
  }

  public void setGroup(int group) {
    this.group = group;
  }

  @Override
  public String toString() {
    return "Student{" +
        "id=" + id +
        ","
        + " name='" + name + '\'' +
        ", secondName='" + secondName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", dateOfBirth=" + dateOfBirth +
        ", adress='" + adress + '\'' +
        ", phoneNamber=" + phoneNamber +
        ", faculty='" + faculty + '\'' +
        ", course=" + course +
        ", group=" + group +
        '}';
  }

}
