package de.telran.lesson6;

import java.util.Scanner;

//Введите 2 слова, воспользуйтесь сканером, состоящие из четного количества букв (проверьте количество букв в слове).
//Нужно получить слово, состоящее из первой половины первого слова и второй половины второго слова. распечатать на консоль.
//Например:
//ввод - mama, papa
//вывод - mapa
public class HomeTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1-ое слово, состоящее из четного количества букв: ");
        String myStr = scanner.nextLine();
        System.out.println(myStr);
        System.out.println("Введите 2-ое слово, состоящее из четного количества букв: ");
        String myStr1 = scanner.nextLine();
        System.out.println(myStr1);
        int length1 = myStr.length() / 2;
        int length2 = myStr1.length() / 2;

        String substr = myStr.substring(0,length1);
        String substr1 = myStr1.substring(length2);
        System.out.println(substr+substr1);
    }
}
