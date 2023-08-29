package org.example.practies.sem1;

public class Animal {

    String name;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
    }

    public void animalInfo(){
        System.out.println("Животное "+ name);
    }

    public void voice(){
        System.out.println(name + " издал звук");
    }

    public void jump(){
        System.out.println(name + " прыгнул");
    }
}
