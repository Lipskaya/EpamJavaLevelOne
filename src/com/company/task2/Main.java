package com.company.task2;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
private static List<Student> getStudentList(){
  //Student[] universityStydents = new Student[10];
  List<Student> universityStydents = new ArrayList<Student>(10);

  Student student1 = new Student();

  student1.setId(1);
  student1.setName("Adam");
  student1.setLastName("Ivanov");
  student1.setSecondName("Adamovich");
  student1.setAdress("Gomel");
  Calendar calendar = Calendar.getInstance();
  calendar.set(2002, 1, 12);
  student1.setDateOfBirth(calendar.getTime());
  student1.setFaculty("maths");
  student1.setCourse(1);
  student1.setPhoneNamber(12345);
  student1.setGroup(4);
  universityStydents.add(student1);

  Student student2 = new Student();
  student2.setId(2);
  student2.setName("Ivan");
  student2.setLastName("Ivanov");
  student2.setSecondName("Ivanovich");
  student2.setAdress("Minsk");
  Calendar calendar1 = Calendar.getInstance();
  calendar.set(2001, 3, 16);
  student2.setDateOfBirth(calendar.getTime());
  student2.setFaculty("maths");
  student2.setCourse(1);
  student2.setPhoneNamber(123345);
  student2.setGroup(4);
  universityStydents.add(student2);

  Student student3 = new Student();
  student3.setId(3);
  student3.setName("Petr");
  student3.setLastName("Petrov");
  student3.setSecondName("Petrovich");
  student3.setAdress("Minsk");
  Calendar calendar2 = Calendar.getInstance();
  calendar.set(2002, 4, 8);
  student3.setDateOfBirth(calendar.getTime());
  student3.setFaculty("geography");
  student3.setCourse(1);
  student3.setPhoneNamber(15645);
  student3.setGroup(2);
  universityStydents.add(student3);

  Student student4 = new Student();
  student4.setId(4);
  student4.setName("Slava");
  student4.setLastName("Petrov");
  student4.setSecondName("Petrovich");
  student4.setAdress("Minsk");
  Calendar calendar3 = Calendar.getInstance();
  calendar.set(2002, 5, 8);
  student4.setDateOfBirth(calendar.getTime());
  student4.setFaculty("geography");
  student4.setCourse(2);
  student4.setPhoneNamber(78645);
  student4.setGroup(2);
  universityStydents.add(student4);

  Student student5 = new Student();
  student5.setId(5);
  student5.setName("Igor");
  student5.setLastName("Igorov");
  student5.setSecondName("Igorovich");
  student5.setAdress("Grodno");
  Calendar calendar4 = Calendar.getInstance();
  calendar.set(2002, 6, 6);
  student5.setDateOfBirth(calendar.getTime());
  student5.setFaculty("geography");
  student5.setCourse(3);
  student5.setPhoneNamber(78345);
  student5.setGroup(1);
  universityStydents.add(student5);

  Student student6 = new Student();
  student6.setId(6);
  student6.setName("Alex");
  student6.setLastName("Alexeev");
  student6.setSecondName("Ivanov");
  student6.setAdress("Vitebsk");
  Calendar calendar5 = Calendar.getInstance();
  calendar.set(2002, 1, 6);
  student6.setDateOfBirth(calendar.getTime());
  student6.setFaculty("philosophy");
  student6.setCourse(3);
  student6.setPhoneNamber(78355);
  student6.setGroup(1);
  universityStydents.add(student6);

  Student student7 = new Student();
  student7.setId(7);
  student7.setName("Eva");
  student7.setLastName("Alexeeva");
  student7.setSecondName("Ivanova");
  student7.setAdress("Vitebsk");
  Calendar calendar6 = Calendar.getInstance();
  calendar.set(2001, 1, 16);
  student7.setDateOfBirth(calendar.getTime());
  student7.setFaculty("philosophy");
  student7.setCourse(3);
  student7.setPhoneNamber(78385);
  student7.setGroup(1);
  universityStydents.add(student7);

  Student student8 = new Student();
  student8.setId(8);
  student8.setName("Vera");
  student8.setLastName("Petrova");
  student8.setSecondName("Ivanovna");
  student8.setAdress("Vitebsk");
  Calendar calendar7 = Calendar.getInstance();
  calendar.set(2002, 9, 2);
  student8.setDateOfBirth(calendar.getTime());
  student8.setFaculty("philology");
  student8.setCourse(3);
  student8.setPhoneNamber(78385);
  student8.setGroup(1);
  universityStydents.add(student8);

  Student student9 = new Student();
  student9.setId(9);
  student9.setName("Ilona");
  student9.setLastName("Petrova");
  student9.setSecondName("Alexsandrovna");
  student9.setAdress("Brest");
  Calendar calendar8 = Calendar.getInstance();
  calendar.set(2002, 5, 2);
  student9.setDateOfBirth(calendar.getTime());
  student9.setFaculty("philology");
  student9.setCourse(3);
  student9.setPhoneNamber(28385);
  student9.setGroup(1);
  universityStydents.add(student9);

  Student student10 = new Student();
  student10.setId(10);
  student10.setName("Ilona");
  student10.setLastName("Isaeva");
  student10.setSecondName("Alexsandrovna");
  student10.setAdress("Brest");
  Calendar calendar9 = Calendar.getInstance();
  calendar.set(2001, 3, 12);
  student10.setDateOfBirth(calendar.getTime());
  student10.setFaculty("philology");
  student10.setCourse(1);
  student9.setPhoneNamber(18385);
  student9.setGroup(1);
  universityStydents.add(student10);

  return universityStydents;
}
  public static void main(String[] args) {

    List<Student> universityStydents = getStudentList();
    //список студентов заданного факультета;
    List<Student> matStudents = listOfStudentsInFaculty("maths", universityStydents);
    matStudents.forEach(x -> System.out.println(x));
    //matStudents.forEach(System.out::println);

    //список факультетов и студентов
    Set<String> facultets = listFaculties(universityStydents);
    facultets.forEach(System.out::println);
    System.out.println("Печатаем список студентов каждого курса на каждом факультете: ");
    for (String facultet : facultets) {
      for (int i = 1; i <= 6; i++) {
        List<Student> listStudentFacultyCourse = listFacultyAndCourse(facultet, i,
            universityStydents);
        if (listStudentFacultyCourse.size() > 0) {
          System.out.println(" Список студентов факультета " + facultet + "курса " + i);
          listStudentFacultyCourse.forEach(System.out::println);
        } else {
          System.out.println("На факультете "+ facultet + " " + i + " курса нет студентов");
        }
      }
    }

    // список студентов, родившихся после заданного года;
    int year = 2002;
    System.out.println("Список студентов, родившихся после заданного года" + year);
    List<Student> studentWasBorn = listYearOfBirth(year, universityStydents);
    studentWasBorn.forEach(System.out::println);

    //список учебной группы
    System.out.println("Список учебной группы");
    List<Student> listOfGroup = listGroups("maths", 4, universityStydents);
    listOfGroup.forEach(System.out::println);
  }


  //список студентов заданного факультета;
  public static List<Student> listOfStudentsInFaculty(String faculty, List<Student> students) {
    List rezalt = new ArrayList();
    for (Student s: students) {
      if (faculty == s.getFaculty()) {
        rezalt.add(s);
      }
    }
    return rezalt;
  }

  //список студентов для каждого факультета и курса;
  public static List<Student> listFacultyAndCourse(String faculty, int course, List<Student> students) {
    List rezalt = new ArrayList();
    for (Student s:students) {
      if (faculty == s.getFaculty() && course == s.getCourse()) {
        rezalt.add(s);
      }
    }
    return rezalt;
  }

  //списки студентов для каждого факультета;
  public static Set<String> listFaculties(List<Student> students) {
    Set rezult = new HashSet();
    for (Student s: students) {
      rezult.add(s.getFaculty());
    }
    return rezult;
  }

  // список студентов, родившихся после заданного года;
  public static List<Student> listYearOfBirth(int year, List<Student> students) {
    List rezalt = new ArrayList();
    for (Student s: students) {
      Calendar c = Calendar.getInstance();
      c.setTime(s.getDateOfBirth());
      Calendar c2 = Calendar.getInstance();
      c2.set(year, 1, 1);
      if (c.after(c2)) {
        rezalt.add(s);
      }
    }
    return rezalt;
  }

  //список учебной группы
  public static List<Student> listGroups(String facultet, int groups, List<Student> students) {
    List rezalt = new ArrayList();
    for (Student s: students) {
      if (groups == s.getGroup() && facultet == s.getFaculty()) {
        rezalt.add(s);
      }
    }
    return rezalt;
  }

}