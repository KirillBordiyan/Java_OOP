package org.example.practies.sem5.mvc.data;

import org.example.practies.sem5.mvc.view.ClientMailView;

import java.net.HttpURLConnection;

public class Mail {
    private Client to;
    private Postman from;
    private String address;
    private String message;

    public Mail(Client to, Postman from, String address, String message) {
        this.to = to;
        this.from = from;
        this.address = address;
        this.message = message;
    }

    public Mail(){}
    public  Mail generateBaseMail(){
        return new Mail(
                new Client("cl1", "brest"),
                new Postman("post1", "lead"),
                "Minsk",
                "some message");
    }
}
