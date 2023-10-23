package de.telran.lesson15;
// 1 уровень сложности: №1.
//Создайте массив из 8 случайных целых чисел из интервала [1;50]
//Выведите массив на консоль в строку.
//Замените каждый элемент с нечетным индексом на ноль.
//Снова выведете массив на консоль в отдельной строке.

import java.util.Arrays;
import java.util.Random;

public class HomeTask1 {
    public static void main(String[] args) {
        int [] arr = new int[8];
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt((50 - 1 + 1) + 1);
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
