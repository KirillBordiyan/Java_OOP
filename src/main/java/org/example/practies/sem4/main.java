package org.example.practies.sem4;

import org.example.practies.sem4.comparators.StidentComporator;
import org.example.practies.sem4.comparators.TeacherComparatorHW;
import org.example.practies.sem4.comparators.UserComparator;
import org.example.practies.sem4.services.StudentService;
import org.example.practies.sem4.services.TeacherServiceHW;
import org.example.practies.sem4.views.StudentView;
import org.example.practies.sem4.views.TeacherViewHW;
import org.example.practies.sem4.views.UserView;

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

        teachers.sort(new TeacherComparatorHW());
        var teacherViewHW = new TeacherViewHW<>();
        teacherViewHW.sendOnConsole(teachers);
        System.out.println();


        List<Student> students = Arrays.asList(
                new Student("s1", 9,25),
                new Student("s2", 4, 16),
                new Student("s3", 12, 20));

        students.sort(new StidentComporator());
        var studentsView = new StudentView<>();
        studentsView.sendOnConsole(students);
        System.out.println();

        StudentService studentService = new StudentService();
        studentService.create("Bob", 19);
        studentService.create("Josh", 22);
        System.out.println(studentService.getAll());
        System.out.println();

        studentService.refactor();


        System.out.println();
        TeacherServiceHW teacherServiceHW2 = new TeacherServiceHW();
        teacherServiceHW2.create("Yan", 30);
        teacherServiceHW2.create("Kate", 25);
        System.out.println(teacherServiceHW2.getAll());
        System.out.println();

        teacherServiceHW2.refactor();




    }
}
