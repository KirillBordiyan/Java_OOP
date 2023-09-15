package org.example.practies.sem5.mvc.data;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Postman extends User{
    private String occupation;
    public Postman(String name, String occupation) {
        super(name);
        this.occupation = occupation;
    }
}
