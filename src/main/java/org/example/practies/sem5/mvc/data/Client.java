package org.example.practies.sem5.mvc.data;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Client extends User{
    private String address;

    public Client(String name, String address) {
        super(name);
        this.address = address;
    }
}
