package org.example.practies.sem4;

import org.example.practies.sem4.comparators.StidentComporator;
import org.example.practies.sem4.comparators.TeacherComparator;
import org.example.practies.sem4.comparators.UserComparator;

import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {

        List<User> users = Arrays.asList(
                new Teacher("t1", 35, "math", 10000),
                new Teacher("t2", 28, "hist", 9000),
                new Teacher("t3", 30,"Eng", 12000),
                new Student("s1", 9,25),
                new Student("s2", 4, 16),
                new Student("s3", 12, 20));

        System.out.println(users);
        users.sort(new UserComparator<>());
        System.out.println(users);

        System.out.println();

        List<Teacher> teachers = Arrays.asList(
                new Teacher("t1", 35, "math", 10000),
                new Teacher("t2", 28, "hist", 9000),
                new Teacher("t3", 30,"Eng", 12000));

        System.out.println(teachers);
        teachers.sort(new TeacherComparator());
        System.out.println(teachers);

        System.out.println();

        List<Student> students = Arrays.asList(
                new Student("s1", 9,25),
                new Student("s2", 4, 16),
                new Student("s3", 12, 20));

        System.out.println(students);
        students.sort(new StidentComporator());
        System.out.println(students);

    }
}
