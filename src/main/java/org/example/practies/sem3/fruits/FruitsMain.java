package org.example.practies.sem3.fruits;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class FruitsMain {
    public static void main(String[] args) {

//        Fruits fruit = Fruits.PINEAPPLE;
//        switch (fruit){
//            case APPLE -> System.out.printf("яблоко - %s", fruit.getName());
//            case BANANA -> System.out.printf("банан - %s", fruit.getName());
//            case GRAPE -> System.out.printf("груша  - %s", fruit.getName());
//            case PINEAPPLE -> System.out.printf("ананас - %s", fruit.getName());
//            case PITCH -> System.out.printf("персик - %s", fruit.getName());
//        }

        ArrayList<Fruits> fruits = new ArrayList<>(Arrays.asList(
                Fruits.APPLE,
                Fruits.BANANA,
                Fruits.PITCH,
                Fruits.PITCH,
                Fruits.PINEAPPLE,
                Fruits.APPLE));

        Iterator<Fruits> iterator = fruits.iterator();
        while (iterator.hasNext()){
            Fruits temp = iterator.next();
            switch (temp){
                case APPLE -> System.out.printf("яблоко - %s\n", temp.getName());
                case BANANA -> System.out.printf("банан - %s\n", temp.getName());
                case GRAPE -> System.out.printf("груша  - %s\n", temp.getName());
                case PINEAPPLE -> System.out.printf("ананас - %s\n", temp.getName());
                case PITCH -> System.out.printf("персик - %s\n", temp.getName());
                default -> System.out.println("hz chto eto");
            }
        }
    }
}


@Getter
enum Fruits {
    APPLE("apple"), BANANA("BAN"), GRAPE("grape"), PINEAPPLE("pineapple"), PITCH("pitch");

    String name;

    Fruits(String name){
        this.name = name;
    }
    Fruits(){}

}
