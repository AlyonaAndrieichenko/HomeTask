package de.telran.lesson12;
import java.util.Scanner;

//Реализуйте программу, которая попросит пользователя ввести год и напечатать этот год.
// Метод isLeap проверяет високосный год или нет.

public class HomeTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = scanner.nextInt();
        System.out.println(year+isLeap(year));
    }
    private static String isLeap (int year) {
        if (year%4 == 0){
            return "г. - високосный год";
        } else {
            return "г. - невисокосный год";
        }
    }
}
