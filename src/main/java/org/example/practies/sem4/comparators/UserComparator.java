package org.example.practies.sem4.comparators;

import org.example.practies.sem4.Student;
import org.example.practies.sem4.User;

import java.util.Comparator;

public class UserComparator<T extends User> implements Comparator<T> {

    @Override
    public int compare(T s1, T s2) {
        return s1.getAge() - s2.getAge();
    }
}
