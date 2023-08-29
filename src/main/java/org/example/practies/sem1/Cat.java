package org.example.practies.sem1;

class Cat {
//    1) Создать класс Cat с полями: имя,цвет,кол-во лет. Поработать с полями напрямую

    String name;
    String colour;
    int age;

    public Cat(String name, String colour, int age) {
        if(!(age < 0)){
            this.age = age;
        }else{
            throw  new IllegalArgumentException("Age can not be negative");
        }
        this.name = name;
        this.colour = colour;
    }
    public Cat(String name, String colour){
        this(name, colour, 0);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(!(age < 0)){
            this.age = age;
        }else{
            throw  new IllegalArgumentException("Age can not be negative");
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", age=" + age +
                '}';
    }

}
