package org.example.practies.sem1;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cat extends Animal{
//    1) Создать класс Cat с полями: имя, цвет, кол-во лет. Поработать с полями напрямую

    String colour;
    int age;

    public Cat(String name, String colour, int age) {
        super(name);
        this.colour = colour;
        this.age = age;
    }

    public void setAge(int age) {
        if(!(age < 0)){
            this.age = age;
        }else{
            throw  new IllegalArgumentException("Age can not be negative");
        }
    }

    @Override
    public void animalInfo() {
        System.out.println("cat " + name + ", colour " + colour + ", age "+ age);
    }
}
