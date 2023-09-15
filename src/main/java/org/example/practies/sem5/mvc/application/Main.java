package org.example.practies.sem5.mvc.application;

import org.example.practies.sem5.mvc.controller.Controller;
import org.example.practies.sem5.mvc.data.Mail;


public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        Mail mail = new Mail();
        mail.generateBaseMail();
        controller.run(mail);


    }
}
