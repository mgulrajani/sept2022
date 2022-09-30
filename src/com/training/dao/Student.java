package com.training.dao;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


class Student {
    private String firstName;
    private String LastName;
    private int score;

    public Student(String firstName, String lastName, int score) {
        this.firstName = firstName;
        LastName = lastName;
        this.score = score;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

class Implementation {
    public List<String> printName(List<Student> studentList) {
        ArrayList studentsList = new ArrayList();
        studentList.stream()
                .filter((student) -> student.getScore() > 35)
                .forEach((student) -> studentsList.add(student.getLastName()));
        return studentsList;
    }

    public String match(List<Student> studentList) {
        Stream<Student> stream = studentList.stream();
        boolean Nonmatch = stream.noneMatch((value) -> {
            return value.getFirstName().contains("e");
        });
        if (Nonmatch) {
            return ("First name does not contain e");
        } else {
            return ("First name contains e");
        }
    }
}
 class Tesett{
     public static void main(String[] args) {
         List<Student> list = new ArrayList<Student>();
         list.add(new Student("Se", "Shambhavi", 90));
         list.add(new Student("Katy", "Moss", 99));
         list.add(new Student("Kyla", "Jenner", 30));
         Implementation i = new Implementation();
         System.out.println(i.printName(list));
         System.out.println(i.match(list));
     }
 }