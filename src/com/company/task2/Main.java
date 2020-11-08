package com.company.task2;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
private static List<Student> getStudentList(){


  List<Student> universityStudents = new ArrayList<>(10);

  Calendar calendar = Calendar.getInstance();
  calendar.set(2002, Calendar.JANUARY, 12);
  universityStudents.add(new Student(1,"Adam","Ivanov","Adamovich",
            calendar.getTime(),"Gomel",12345,"maths",1,4));


  calendar.set(2001, Calendar.MARCH, 16);
  universityStudents.add(new Student(2,"Ivan","Ivanov","Ivanovich",
            calendar.getTime(),"Minsk",123345,"maths",1,4));

  calendar.set(2002, Calendar.APRIL, 8);
  universityStudents.add(new Student(3,"Petr","Petrov","Petrovich",
          calendar.getTime(),"Minsk",15645,"geography",1,2));

  calendar.set(2002, Calendar.MAY, 8);
  universityStudents.add(new Student(4,"Slava","Petrov","Petrovich",
          calendar.getTime(),"Minsk",78645,"geography",2,2));

  calendar.set(2002, Calendar.JUNE, 6);
  universityStudents.add(new Student(5,"Igor","Igorov","Igorovich",
          calendar.getTime(),"Grodno",78345,"geography",3,1));

  calendar.set(2002, Calendar.JANUARY, 6);
  universityStudents.add(new Student(6,"Alex","Alexeev","Ivanov",
          calendar.getTime(),"Vitebsk",78355,"philosophy",3,1));

  calendar.set(2001, Calendar.JULY, 16);
  universityStudents.add(new Student(7,"Eva","Alexeeva","Ivanova",
          calendar.getTime(),"Vitebsk",78385,"philosophy",3,1));

  calendar.set(2002, Calendar.SEPTEMBER, 2);
  universityStudents.add(new Student(8,"Vera","Petrova","Ivanovna",
          calendar.getTime(),"Vitebsk",78389,"philosophy",3,1));

  calendar.set(2002, Calendar.OCTOBER, 2);
  universityStudents.add( new Student(9,"Ilona","Petrova","Alexsandrovna",
           calendar.getTime(),"Brest",28385,"philosophy",3,1));

  calendar.set(2001, Calendar.NOVEMBER, 12);
  universityStudents.add(new Student(10,"Ilona","Isaeva","Alexsandrovna",
          calendar.getTime(),"Brest",28385,"philosophy",1,1));

  return universityStudents;
}
  public static void main(String[] args) {

    List<Student> universityStydents = getStudentList();
    //список студентов заданного факультета;
    List<Student> matStudents = listOfStudentsInFaculty("maths", universityStydents);
    matStudents.forEach(System.out::println);


    //список факультетов и студентов
    Set<String> facultets = listFaculties(universityStydents);
    facultets.forEach(System.out::println);
    System.out.println("Печатаем список студентов каждого курса на каждом факультете: ");
    for (String facultet : facultets) {
      for (int i = 1; i <= 6; i++) {
        List<Student> listStudentFacultyCourse = listFacultyAndCourse(facultet, i,
            universityStydents);
        if (!listStudentFacultyCourse.isEmpty()) {
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
    List<Student> rezalt = new ArrayList<>();
    for (Student s: students) {
      if (faculty.equals(s.getFaculty())) {
        rezalt.add(s);
      }
    }
    return rezalt;
  }

  //список студентов для каждого факультета и курса;
  public static List<Student> listFacultyAndCourse(String faculty, int course, List<Student> students) {
    List<Student> rezalt = new ArrayList<>();
    for (Student s:students) {
      if (faculty.equals(s.getFaculty()) && course == s.getCourse()) {
        rezalt.add(s);
      }
    }
    return rezalt;
  }

  //списки студентов для каждого факультета;
  public static Set<String> listFaculties(List<Student> students) {
    Set <String> rezult = new HashSet<>();
    for (Student s: students) {
      rezult.add(s.getFaculty());
    }
    return rezult;
  }

  // список студентов, родившихся после заданного года;
  public static List<Student> listYearOfBirth(int year, List<Student> students) {
    List <Student> rezalt = new ArrayList<>();
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
    List <Student> rezalt = new ArrayList<>();
    for (Student s: students) {
      if (groups == s.getGroup() && facultet.equals(s.getFaculty())) {
        rezalt.add(s);
      }
    }
    return rezalt;
  }

}