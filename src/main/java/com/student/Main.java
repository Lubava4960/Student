package com.student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class Student {
    private String surname;
    private int course;
    private LocalDate birthday;

    public Student(String surname, int course, LocalDate birthday) {
        this.surname = surname;
        this.course = course;
        this.birthday = birthday;
    }
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Student : " +
                "(surname='" + surname + '\'' +
                ", course=" + course +
                ", birthday=" + birthday +
                ')';
    }
}


public class Main {
    public static void main(String[] args) {
        List<Student>students= new ArrayList<>();
        students.add(new Student("Филатов", 1, LocalDate.of(2004, 6, 2)));
        students.add(new Student("Иванов", 3, LocalDate.of(2002, 2, 10)));
        students.add(new Student("Сидоров", 4, LocalDate.of(2001, 1, 15)));
        students.add(new Student("Иванов", 2, LocalDate.of(2003, 8, 25)));
        Map<String, Student> studentMap = groupStudentsBySurname(students);


        for (Map.Entry<String, Student> entry : studentMap.entrySet()) {
            System.out.println("Фамилия: " + entry.getKey() + ", Студент: " + entry.getValue());
        }
    }

    private static Map<String, Student> groupStudentsBySurname(List<Student> students) {
        Map<String, Student> studentMap = new HashMap<>();

        for (Student student : students) {
            String surname = student.getSurname();
            if (!studentMap.containsKey(surname)) {
                studentMap.put(surname, student);
            } else {

                studentMap.put(surname, student);
            }
        }

        return studentMap;
    }
}
