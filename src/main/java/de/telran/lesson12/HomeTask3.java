package de.telran.lesson12;
import java.util.Scanner;

//Реализуйте программу, которая попросит пользователя ввести три целых числа (используйте сканер).
//Напишите метод getMax,который принимает эти 3 параметра и возвращает наибольший из них.
//Напечатает максимум из трех чисел.

public class HomeTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое целое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе целое число: ");
        int num2 = scanner.nextInt();
        System.out.print("Введите третье целое число: ");
        int num3 = scanner.nextInt();
        System.out.println("Число "+getMax(num1,num2,num3)+" больше остальных");
    }

    private static int getMax (int num1, int num2, int num3) {
        if (num1 >= num2 && num1 >= num3) {
            return num1;
        } else if (num2 >= num1 && num2 >= num3) {
            return num2;
        } else {
            return num3;
        }
    }
}
