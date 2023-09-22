package org.example.practies.sem5.mvc.controller;

import org.example.practies.sem5.mvc.data.Client;
import org.example.practies.sem5.mvc.data.Mail;
import org.example.practies.sem5.mvc.service.MailService;
import org.example.practies.sem5.mvc.view.ClientMailView;
import org.example.practies.sem5.mvc.view.ViewInterface;

import java.util.Scanner;

public class Controller {
    MailService mailService = new MailService();
    ClientMailView clientMailView = new ClientMailView();

    public void run(Mail mail){

        System.out.println("1-4");
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            switch (scanner.nextLine()) {
                case "1" -> {
//                    mailService.sendMail(mail);
                }
                case "2" -> {
                    mailService.returnMailBack(scanner.nextLine());
                }
                case "3" -> {
                    mailService.deleteMail();
                }
                case "4" -> {
                    mailService.getMail();
                }
                default -> {
                    flag = false;
                }
            }
            System.out.println("cont?");
            if (!"y".equals(scanner.nextLine())) {
                flag = false;
            }
        }
    }

}
