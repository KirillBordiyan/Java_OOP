package org.example.exeptions.sem1;

import java.util.ArrayList;
import java.util.List;

public class ExeptionSem1P2 {
    public static void main(String[] args) {
//        int[][] array = new int[][]{
//                {1,1,1},
//                {1,0,1},
//                {1,1,0}};
//        System.out.println("sqrtArraySum = " + sqrtArraySum(array));


        Integer[] arr = new Integer[]{1,2,3,null, null};
        checkArray(arr);
    }

//    Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
//    Необходимо посчитать и вернуть сумму элементов этого массива.
//    При этом накладываем на метод 2 ограничения: метод может работать только с квадратными массивами
//    (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать только значение 0 или 1.
//    Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.

    private static int sqrtArraySum(int[][] array) {
        int elementSum = 0;
        if (isSqrt(array)) {
            if(isZeroOne(array)){
            for (int[] item : array) {
                for (int num : item) {
                    elementSum += num;
                }
            }
            }else{
                throw new RuntimeException("не 0 или 1");
            }
        }else{
            throw new RuntimeException("не квадратная");
        }
        return elementSum;
    }


    private static boolean theSame(List<Integer> innerNumberArray, int outerLen) {
        if (innerNumberArray.size() == outerLen) {
            for (int number : innerNumberArray) {
                if (outerLen != number) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }


    private static boolean isSqrt(int[][] array){
        int firstSize = array.length;
        List<Integer> innerSizeAr = new ArrayList<>();
        for(int[] innerAr: array){
            innerSizeAr.add(innerAr.length);
        }
        if(!theSame(innerSizeAr, firstSize)){
            return false;
        }
        return true;
    }




    private static boolean isZeroOne(int[][] array){
        boolean flag = false;
        for(int[] item: array){
            for(int number: item){
                if(number == 1 || number == 0){
                    flag = true;
                }else{
                    flag = false;
                    break;
                }
            }
            if(flag == false){
                break;
            }
        }
        return flag;
    }

//    Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента
//    целочисленный одномерный массив.
//    Метод должен пройтись по каждому элементу и проверить что он не равен null.
//    А теперь реализуйте следующую логику:
//    Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
//    Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”

    private static void checkArray(Integer[] array){
        StringBuilder marks = new StringBuilder();
        for(int i = 0; i < array.length; i++){
            if(array[i] == null){
                marks.append(i + " ");
            }
        }
        if(marks.length() != 0){
            throw new RuntimeException("indexes -> " + marks + " -> null");
        }
    }

}
