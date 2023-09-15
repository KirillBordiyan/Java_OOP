package org.example.practies.sem5.mvc.view;

public class ClientMailView implements ViewInterface{

    @Override
    public void senMail() {
        System.out.println("you send message");
    }

    @Override
    public void getMail() {
        System.out.println("you received message");
    }

    @Override
    public void talkWPostman() {
        System.out.println("you talk with postman");
    }
}
