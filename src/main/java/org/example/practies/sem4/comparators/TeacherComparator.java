package org.example.practies.sem4.comparators;

import org.example.practies.sem4.Teacher;
import org.example.practies.sem4.User;

import java.util.Comparator;

public class TeacherComparator implements Comparator<Teacher> {

    @Override
    public int compare(Teacher t1, Teacher t2) {
        return t1.getSalary() - t2.getSalary();
    }


}
