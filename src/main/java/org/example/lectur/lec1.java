package org.example.lectur;


import java.nio.channels.Pipe;

/*правильное:
план - реализация только после абстракций
абстракция - что делает?
поведение - как делает?
спецификация - набор правил, описывающих API

класс - описание сущности предметной области, позволяющий выделить
некоторые общие характеристики, состояния и поведения, зависящее от его состояния

предметная область - множество всех предметов (явлений), решаемой проблемы

экземпляр класса - конкретный представитель конкретного класса

состояние - набор данных (поля, атрибуты, члены класса) - поля, константы, события

поведение - функции для работы с данными и выполнения полезной работы - конструкторы и методы




Инкапсуляция  - св-во системы, позвол объединить поля и методы класса, иногда скрыв детали реализации
*/
public class lec1 {
    public static void main(String[] args) {

        Point a = new Point(4 , 5);
        System.out.println(a);

        Point b = new Point(2, 3);
        System.out.println(b);
        System.out.println(Point.distance(a,b));

        Robot robot = new Robot("G12", 1);
        robot.start();
        robot.stop();
    }

}



class Point{
    private int x, y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    static double distance(Point a, Point b){
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }

    @Override
    public String toString(){
        return String.format("x: %d, y: %d", x, y);
    }


}


class Robot{
    private String name;
    private int level;

    Robot(String name, int level){
        this.name = name;
        this.level = level;
    }

    public void start(){
        this.startOS();
        this.hi();
    }

    public void stop(){
        this.stopOS();
        this.goodBye();
    }

    private void startOS(){
        System.out.println("Start");
    }
    private void hi(){
        System.out.println("Hi, my name " + name);
    }
    private void stopOS(){
        System.out.println("Stop");
    }
    private void goodBye(){
        System.out.println("Bye");
    }
}