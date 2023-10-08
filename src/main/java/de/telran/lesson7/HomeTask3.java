package de.telran.lesson7;

import java.util.Scanner;

//Программа запрашивает у пользователя сумму в Евро для конвертации
//Реализовать метод, который конвертирует полученную сумму в сумму в долларах США

public class HomeTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму в Евро для конвертации: ");
        double eur = scanner.nextDouble();
        System.out.printf("Cумма в долларах США: %.2f\n",convertor(eur));
    }
    static double convertor(double eur) {
        return eur * 1.06;
    }
}

