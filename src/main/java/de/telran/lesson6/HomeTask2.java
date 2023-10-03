package de.telran.lesson6;

//Реализовать программу, выводящую на экран результаты:
//Сложения двух чисел
//Вычитания двух чисел
//Умножения двух чисел
//Деления двух чисел
//Каждая из арифметических операций должна быть реализована как отдельный метод.

public class HomeTask2 {
    public static void main(String[] args) {
        int a = 88;
        int b = 22;

        printSum(a, b);
        printDif(a, b);
        printMul(a, b);
        printDiv(a, b);
    }

    static void printSum(int arg1, int arg2) {
        int sum = arg1 + arg2;
        System.out.println("Сложение двух чисел: "+arg1 + " + " + arg2 + " = " + sum);
    }
    static void printDif(int arg1, int arg2) {
        int dif = arg1 - arg2;
        System.out.println("Вычитание двух чисел: "+arg1 + " - " + arg2 + " = " + dif);
    }
    static void printMul(int arg1, int arg2) {
        int mul = arg1 * arg2;
        System.out.println("Умножение двух чисел: "+arg1 + " * " + arg2 + " = " + mul);
    }
    static void printDiv(int arg1, int arg2) {
        int div = arg1 / arg2;
        System.out.println("Деление двух чисел: "+arg1 + " / " + arg2 + " = " + div);
    }
}
