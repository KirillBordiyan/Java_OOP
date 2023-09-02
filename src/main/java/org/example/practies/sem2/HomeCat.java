package org.example.practies.sem2;

import lombok.Getter;

public class HomeCat extends Cat{
    public static int countOfHomeCats;


    public HomeCat(String name) {
        super(name);
        countOfHomeCats++;
    }


    @Override
    public void couldSwim(int distance) {
        System.out.println("Котики не плавают");
        canParticipate = false;
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
