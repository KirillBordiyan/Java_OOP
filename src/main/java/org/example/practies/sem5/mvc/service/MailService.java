package org.example.practies.sem5.mvc.service;

import org.example.practies.sem5.mvc.data.Mail;

public class MailService implements MailInterface{

//    @Override
//    public String sendMail(Mail mail) {
//        return "mail: `" + mail + "` send";
//    }

    @Override
    public void returnMailBack(String mail) {
        System.out.println("mail return back!");
    }

    @Override
    public void deleteMail() {
        System.out.println("mail is delete!");
    }

    @Override
    public void getMail() {
        System.out.println("mail received!");
    }

}
