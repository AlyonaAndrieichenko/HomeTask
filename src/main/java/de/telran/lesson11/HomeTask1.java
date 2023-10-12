package de.telran.lesson11;

//        Создать программу, выводящую на экран ближайшее к 10 из двух чисел,
//        записанных в переменные m и n.
//        Числа могут быть, как целочисленные, так и дробные.
//
//        Например :
//        ввод : m=10.5, n=10.45
//        вывод: Число 10.45 ближе к 10.

import java.util.Scanner;

public class HomeTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myInt = 10;
        System.out.print("Введите первое число: ");
        double m = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double n = scanner.nextDouble();
        System.out.print("Ближе к 10 число: "+calcDouble(m,n));
    }

        static double calcDouble (double m, double n) {
            double res = Math.abs(m-10);
            double res2 = Math.abs(n-10);
        if (res == res2) {
            return 0;
        }
        if (res > res2) {
            return n;
        } else {
            return m;
        }
    }
}
