package org.example.practies.sem2;


public abstract class Cat extends Animal{
    public static int countOfCats;
    protected final int swimmingDistance = 0;
    protected final int runningDistance = 200;

    public Cat(String name) {
        super(name);
        countOfCats++;
    }
}
