package org.example.practies.sem4.services;

import org.example.practies.sem4.Teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherServiceHW implements UserService<Teacher> {

    private List<List<Teacher>> teacherList = new ArrayList<>();
    @Override
    public List<List<Teacher>> getAll() {
        return teacherList;
    }

    @Override
    public void create(String fio, int age) {
        Teacher teacher = new Teacher(fio, age);
        teacherList.add(List.of(teacher));

    }

    @Override
    public void refactor() {
        System.out.println("Choose teacher number below: ");

        for (int i = 0; i < teacherList.size(); i++){
            System.out.println(i + 1+ ": " + teacherList.get(i));
        }

        Scanner scanner = new Scanner(System.in);

        Teacher refTeach = teacherList.get(Integer.parseInt(scanner.nextLine())-1).get(0);
        System.out.println(refTeach);

        boolean enough = false;

        while(!enough) {
        System.out.println("""
                Choose what u want to do:
                1 - set new name
                2 - set new age
                3 - set new subject
                4 - set new salary
                e - exit""");
            switch (scanner.nextLine()) {
                case "1" -> {
                    System.out.println("Input new name: ");
                    refTeach.setFio(scanner.nextLine());
                    System.out.println(refTeach);
                }
                case "2" -> {
                    System.out.println("Input new age: ");
                    refTeach.setAge(Integer.parseInt(scanner.nextLine()));
                }
                case "3" -> {
                    System.out.println("Input new subject: ");
                    refTeach.setSubject(scanner.nextLine());
                }
                case "4" -> {
                    System.out.println("Input new salary: ");
                    refTeach.setSalary(Integer.parseInt(scanner.nextLine()));
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
