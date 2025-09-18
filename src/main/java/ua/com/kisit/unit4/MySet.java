package ua.com.kisit.unit4;

import java.util.HashSet;
import java.util.Set;

public class MySet {

    public static void main(String[] args) {

        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(1);
        integerSet.add(2);
        integerSet.add(3);
        integerSet.add(4);

        System.out.println(integerSet);
        integerSet.add(4);
        System.out.println(integerSet);

        // v.1
        Student student = new Student();
        student.setId(1);
        student.setFirstName("Vasya");
        student.setLastName("Pypkin");
        student.setAge(20);

        System.out.println(student);

        Student student2 = new Student();
        student2.setId(2);
        student2.setFirstName("Iva");
        student2.setLastName("Pypkina");
        student2.setAge(18);

        // v.2
        Student student3 = new Student(3, "Ivanka", "Pypkina", 25);

        Student student4 = new Student(4, "Ivanka", "Pypkina", 25);

        Set<Student> studentSet = new HashSet<>();
        studentSet.add(student);
        studentSet.add(student2);
        studentSet.add(student3);
        studentSet.add(student4);

        System.out.println(studentSet);

    }

}
