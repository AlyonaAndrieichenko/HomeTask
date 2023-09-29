package de.telran.lesson4;

//Создайте методы с математическими операциями +, -, *, /
//Каждый метод принимает два числа в параметрах и возвращает результат
//Вызовите все методы в main
//Результат распечатайте в консоль

import java.util.Scanner;

public class HomeTask2 {
    public static void main(String[] args) {
        int a = add(5, 10);
        int d = dif(29, 15);
        int m = mult(82, 73);
        int dv = div(60, 10);

        System.out.println(a);
        System.out.println(d);
        System.out.println(m);
        System.out.println(dv);

    }

        private static int add(int num1, int num2){
            return num1 + num2;
        }
        private static int dif(int num1, int num2){
            return num1 - num2;
        }
        private static int mult(int num1, int num2){
            return num1 * num2;
        }
        private static int div(int num1, int num2){
            return num1 / num2;
        }
    }





