package org.example.practies.sem1;

public class Sem1 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", "Orange", 2);
        System.out.println(cat1.getColour());
        cat1.animalInfo();

        Vector vector1 = new Vector(2,4,5);
        Vector vector2 = new Vector(4,3,1);
        System.out.println(vector1.len());
        System.out.println("vector2.scalar(vector2) = " + vector2.scalar(vector2));

        Vector resVector = vector1.multiply(vector2);
        System.out.println(resVector);

        double cos = vector1.getCos(vector2);
        System.out.println(cos);


        Animal animal = new Animal();
        animal.name = "byba";
        animal.animalInfo();
        animal.voice();
        animal.jump();
    }
}
