package org.example.practies.sem2;


public class Tiger extends Cat{
    public static int countOfTigers;
    protected final int swimmingDistance = 40;
    protected final int runningDistance = 800;
    public Tiger(String name) {
        super(name);
        countOfTigers++;
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
