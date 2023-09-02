package org.example.practies.sem2;


public class Dog extends Animal{
    public static int countOfDog;
    private final int swimmingDistance = 10;
    private final int runningDistance = 500;


    Dog(String name){
        super(name);
        countOfDog++;
    }

    @Override
    public void couldSwim(int distance) {
        if(distance < 0){
            System.out.println("non negative param swimming distance!");
        }else if(distance > swimmingDistance){
            System.out.println(name + " не смог проплыть :(");
            canParticipate = false;
        }else{
            System.out.println("получилось, " + name + " проплыл");
        }
    }

    @Override
    public void couldRun(int distance) {
        if(distance <= 0){
            System.out.println("only non negative or =/= 0 param running distance!");
        }else if(distance > runningDistance){
            System.out.println(name + " не смог пробежать :(");
            canParticipate = false;
        }else{
            System.out.println("получилось, " + name + " пробежал");
        }
    }
}
