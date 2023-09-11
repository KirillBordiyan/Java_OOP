package org.example.practies.sem4.services;

import org.example.practies.sem4.Student;
import org.example.practies.sem4.Teacher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StudentService implements UserService<Student> {

    private List<List<Student>> studentList = new ArrayList<>();

    @Override
    public List<List<Student>> getAll() {
        return studentList;
    }

    @Override
    public void create(String fio, int age) {
        Student student = new Student(fio, age);
        studentList.add(List.of(student));
    }

    @Override
    public void refactor() {
        System.out.println("Choose teacher number below: ");

        for (int i = 0; i < studentList.size(); i++){
            System.out.println(i + 1+ ": " + studentList.get(i));
        }

        Scanner scanner = new Scanner(System.in);

        Student refStud = studentList.get(Integer.parseInt(scanner.nextLine())-1).get(0);
        System.out.println(refStud);

        boolean enough = false;

        while(!enough) {
            System.out.println("""
                Choose what u want to do:
                1 - set new name
                2 - set new age
                3 - set new academic performance
                e - exit""");
            switch (scanner.nextLine()) {
                case "1" -> {
                    System.out.println("Input new name: ");
                    refStud.setFio(scanner.nextLine());
                }
                case "2" -> {
                    System.out.println("Input new age: ");
                    refStud.setAge(Integer.parseInt(scanner.nextLine()));
                }
                case "3" -> {
                    System.out.println("Input new subject: ");
                    refStud.setAcademicPerformance(Integer.parseInt(scanner.nextLine()));
                }
                case "e" -> {
                    enough = true;
                }
                default -> {
                    System.out.println("only list numbers");
                }
            }
            System.out.println("Continue refactor?(y/n)");
            if(!"y".equals(scanner.nextLine())){
                enough = true;
            }
        }

    }
}
