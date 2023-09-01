package org.example.lectur;


/*
 * Абстракция - св-во системы, позвол описать общие характеристики базового класса для всех его производных классов,
 * а наполнение деталями переходит каждому из этих классов
 *
 * в абстрактном классе определяются лишь общие поля и характер методов, которые должны быть конкретно реализованы
 * в производных классах, а не в самом базовом классе
 *
 * если класс абстрактный, нельзя создать экземпляр класса на его основе
 * т.е: HeroBase dr = new Druid(); - можно
 *      HeroBase hb = new HeroBase(); - нельзя
 *
 *
 */
public class lec2 {
    public static void main(String[] args) {

        System.out.println(Foo.getCount());

        Doo f1 = new Doo();
        Doo f2 = new Doo();
        Doo f3 = new Doo();

        f3.printSmth();
        System.out.println(Foo.getCount());

    }
}



abstract class Foo{

    public Integer value;
    private static Integer count = 0;

    public static Integer getCount(){
        return count;
    }

    Foo(){
        count++;
    }

    public abstract void printSmth();
}

class Doo extends Foo{

    @Override
    public void printSmth(){
        System.out.println("smth");
    }
}



