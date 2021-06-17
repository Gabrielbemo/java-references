package br.com.java.javacore.classestest;

import br.com.java.javacore.classes.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student gabriel = new Student();
        gabriel.name = "Gabriel";
        gabriel.registration = "3233";
        gabriel.age = 21;

        System.out.println(gabriel.name);
        System.out.println(gabriel.registration);
        System.out.println(gabriel.age);
    }
}
