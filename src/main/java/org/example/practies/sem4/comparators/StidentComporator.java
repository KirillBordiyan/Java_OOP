package org.example.practies.sem4.comparators;

import org.example.practies.sem4.Student;

import java.util.Comparator;

public class StidentComporator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getAcademicPerformance() - s2.getAcademicPerformance();
    }
}
