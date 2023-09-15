package org.example.practies.sem5.mvc.data;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class User {
    protected String name;

    public User(String name) {
        this.name = name;
    }
}
