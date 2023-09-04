package org.example.practies.sem3.calendar;



public class Calendar {
    public static void main(String[] args) {
        Month month = Month.DEC;
//        System.out.println("month = " + month);
        System.out.println(month.getNumber());
        month.setNumber(3);
        System.out.println(month.getNumber() + " " + month.name());

    }
}
