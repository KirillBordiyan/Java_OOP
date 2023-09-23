package org.example.exeptions.sem1;

import java.util.Scanner;

public class ExeptionSem1P1 {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,11,31,16,14,34,167,176,123,190,56,18,22,10};
        contr(array);
    }

    private static Integer arrayLength(int[] arr, int min){
        //длинна массива, -1 если она меньше заданного минимума
        if(arr.length >= min){
            return arr.length;
        }else{
            return -1;
        }
    }

//    Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение.
//    Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
//    если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
//    если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
//    если вместо массива пришел null, метод вернет -3
//    придумайте свои варианты исключительных ситуаций и верните соответствующие коды ошибок.
//    Напишите метод, в котором реализуйте взаимодействие с пользователем.
//    То есть, этот метод запросит искомое число у пользователя, вызовет первый,
//    обработает возвращенное значение и покажет читаемый результат пользователю.
//    Например, если вернулся -2, пользователю выведется сообщение: “Искомый элемент не найден”.

    private static int getIndex(int[] array, int tryFind, int min){
        if(array == null){
            return -3;
        } else if (arrayLength(array, min) == -1) {
            return -1;
        } else {
            for (int i = 0; i < array.length; i++){
                if(array[i] == tryFind){
                    return i;
                }
            }
        }
        return -2;
    }

    private static void contr(int[] array){
        System.out.println("минимальная длинна массива:");
        int minLen = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.println("искать число:");
        int find = Integer.parseInt(new Scanner(System.in).nextLine());
        int result = getIndex(array, find, minLen);
        switch (result){
            case -1:{
                System.out.println("длинна не сходиться");
                break;
            }
            case -2:{
                System.out.println("не найдено");
                break;
            }
            case -3: {
                System.out.println("null дядя");
                break;
            }
            default: {
                System.out.println(result);
                break;
            }
        }
    }
}

