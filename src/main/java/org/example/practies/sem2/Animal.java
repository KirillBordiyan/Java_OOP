package org.example.practies.sem2;

import lombok.Getter;


public abstract class Animal {

    String name;
    public boolean canParticipate;
    public static int countOfAnimals;


    public Animal(String name) {
        this.name = name;
        this.canParticipate = true;
        countOfAnimals++;
    }

    public abstract void couldSwim(int distance);
    public abstract void couldRun(int distance);
}
