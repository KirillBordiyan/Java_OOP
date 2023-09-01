package org.example.lectur;


import java.util.ArrayList;

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




Инкапсуляция - св-во системы, позвол объединить поля и методы класса, иногда скрыв детали реализации
Наследование - св-во системы, повзол описать новый класс на основе существующего, с частичной или полностью
                заимствующейся функциональностью
                класс, от которого создается - родитель
                класс, который создается - наследник или производный класс

Полиморфизм - св-во системы, использовать объекты с одинаковым интерфейсом без информации о типе и внутр структуре объекта

короче, мы можем создать объект базового класса с использованием конструктора его наследника:
Base a = new Heir1()
Base b = new Heir2()
и а и b будут иметь возможности наследников, хотя созданы как экземпляры Base
как бы создается переменная базового класса и внутрь кладется экземпляр наследника


*/
public class lec1 {
    public static void main(String[] args) {

        Point a = new Point(4 , 5);
        System.out.println(a);

        Point b = new Point(2, 3);
        System.out.println(b);
        System.out.println(Point.distance(a,b));

        Robot robot = new Robot("G12");
        robot.power();
        robot.work();
        robot.power();
        robot.work();
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

    enum State{
        On, Off
    }

    private static int defaultIndex;
    private static ArrayList<String> names;

    static {
        defaultIndex = 1;
        names = new ArrayList<String>();
    }

    private String name;
    private int level;
    private State state;

     /**
     * new Robot
     * @param name Name
     * @param level Level
     */
    private Robot(String name, int level){
        if((name.isEmpty())
        || Character.isDigit(name.charAt(0))
        || Robot.names.contains(name)){
            this.name = String.format("DefaultName_%d",defaultIndex++);
        }
        else{
            this.name = name;
        }

        Robot.names.add(name);
        this.level = level;
        this.state = State.Off;
    }

    Robot(String name){
        this(name, 1);
    }

    Robot(){
        this("");
    }

    public void power(){
        if(this.state == State.Off){
            this.start();
            this.state = State.On;
        }else{
            this.stop();
            this.state = State.Off;
        }
    }

    public void work(){
        if(this.state == State.On){
            System.out.println("Working...");
        }
    }
    private void start(){
        this.startOS();
        this.hi();
    }

    private void stop(){
        this.stopOS();
        this.goodBye();
    }

    private void startOS(){
        System.out.println("Starting!");
    }
    private void hi(){
        System.out.println("Hi, my name " + name);
    }
    private void stopOS(){
        System.out.println("Stop work");
    }
    private void goodBye(){
        System.out.println("Bye!");
    }
}