package org.example.practies.sem2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        ArrayList<Animal> animals = new ArrayList<>(Arrays.asList(
                new Dog("Bobik"),
                new HomeCat("Chudik"),
                new Tiger("Tiger")));

        ArrayList<String> actions = new ArrayList<>(Arrays.asList(
                "run", "run", "swim","run","swim"));

        int swim = 30;
        int run = 350;


        for (Animal animal: animals){
            for(String action: actions){
                switch (action){
                    case "run" -> {
                        if(animal.canParticipate){
                            animal.couldRun(run);
                            run+=50;
                        }
                    }
                    case "swim" -> {
                        if (animal.canParticipate){
                            animal.couldSwim(swim);
                            swim+=5;
                        }
                    }
                }
            }

        }


    }
}
/*
	Создать классы Собака, Кот, Домашний Кот, Тигр, Животное
         Животные могут бежать и плыть. В качестве аргумента каждому методу передается длина препятствия.
         У каждого животного есть ограничения на действия (бег: кот — 200 м, собака — 500 м; плавание: кот — не умеет плавать, собака — 10 м). Результатом выполнения действия будет печать в консоль.
         Например: dogBobik.run(150); -> 'Бобик пробежал 150 м'.
         Создать один массив с животными и заставить их по очереди пробежать дистанцию и проплыть.
         Добавить подсчет созданных Домашних Котов, Тигров, Собак, Животных.
*/