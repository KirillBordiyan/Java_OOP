package org.example.practies.sem5.classes;

public class Main {
    public static void main(String[] args) {

        Outer outer = new Outer();
        Outer.Inner inner = new Outer.Inner(15);
        inner.printer();

//        @Getter
//        class Pack{
//            int x;
//
//            public Pack(int x) {
//                this.x = x;
//            }
//
//        }
//
//        Pack pack = new Pack(10);
//        System.out.println("pack.getX() = " + pack.getX());

        //анонимный класс:
        //экземпляр интерфейса
        //прям тут описываются методы
        //используется, все)
        //однако объект flyable будет относиться к Main классу, тк по сути Main implements Flyable
        Flyable flyable = new Flyable() {

            @Override
            public void fly() {
                System.out.println("fly");
            }

            @Override
            public void noF() {
                System.out.println("no fly");
            }
        };

        flyable.fly();
        //такое написание можно заменить лямбдой:
        //Flyable flyable = () -> System.out.println("fly");
        //flyable.fly();
        //но это работает только если интерфейс имеет 1 метод

    }
}


class Outer{
    Outer(){
    }

    static class Inner{
        int innerV;

        Inner(int innerV){
            this.innerV = innerV;
        }

        public int getInnerV() {
            return innerV;
        }

        public void setInnerV(int innerV) {
            this.innerV = innerV;
        }

        public void printer(){
            System.out.println(this.innerV);
        }
    }


}

