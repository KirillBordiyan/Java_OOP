package org.example.practies.sem5.mvc.service;


import org.example.practies.sem5.mvc.data.Mail;

public interface MailInterface {

    String sendMail(Mail mail);
    void returnMailBack(String mail);
    void deleteMail();
    void getMail();
}
