package ua.com.kisit.unit4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MyList {

    public static void main(String[] args) {


        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(list);

//        list.add(11);
        System.out.println(list);

        List<Integer> list2 = new ArrayList<>();
        list2.add(11);
        list2.add(12);
        list2.add(13);
        list2.add(14);

        System.out.println(list2.get(0));
        list2.set(1, 20);

        list2.add(1,30);

        System.out.println(list2);

        list2.remove(1);

        System.out.println(list2);

        list2.clear();

        System.out.println(list2);


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

        List<Student> studentList = new ArrayList<>();

        studentList.add(student);
        studentList.add(student2);
        studentList.add(student3);

        System.out.println(studentList);

        studentList
                .stream()
                .forEach(el -> System.out.println(el));

        List<Student> studentSorted = studentList
                .stream()
                .sorted(Comparator.comparing(Student::getAge))
                .toList();

        System.out.println(studentSorted);


        Student studentMinAge = studentList.stream().min(Comparator.comparing(Student::getAge)).get();
        System.out.println(studentMinAge);

        Student studentMaxAge = studentList.stream().max(Comparator.comparing(Student::getAge)).get();
        System.out.println(studentMaxAge);

        studentList.stream().filter(el -> el.getAge() >= 20).forEach(el -> System.out.println("filter:" + el));

        List<String> names = studentList.stream().map(Student::getFirstName).collect(Collectors.toList());
        System.out.println(names);

        Student student4 = new Student(4, "Ivanka", "Pypkina", 25);

        studentList.add(student4);

        System.out.println(studentList);

        studentList.remove(student4);

        System.out.println(studentList);
    }

}
