package org.example.practies.sem4.services;

import java.util.List;

public interface UserService<T> {
    List<List<T>> getAll();
    void create(String fio, int age);
    void refactor();

}
