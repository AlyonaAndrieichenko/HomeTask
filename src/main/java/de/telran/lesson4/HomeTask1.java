package de.telran.lesson4;

//Создайте строку через new - I study Basic Java!
//Распечатать пред-последний символ строки. Используем метод String.charAt().
//Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
//Вырезать строку Java c помощью метода String.substring().
//Заменить все символы “а” на “о”.
//Преобразуйте строку к верхнему регистру.
//Преобразуйте строку к нижнему регистру.

import java.util.Locale;

import static jdk.nashorn.internal.runtime.regexp.joni.Syntax.Java;

public class HomeTask1 {
    public static void main(String[] args) {
        String str = new String("I study Basis Java!");
        System.out.println(str);

        char symbol = str.charAt(str.length()-2);
        System.out.println(symbol);

        System.out.println(str.contains("Java"));

        //System.out.println(str.indexOf("Java"));

        String subStr = str.substring(14, 18);
        System.out.println(subStr);

        System.out.println(str.replace('a', 'o'));

        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
    }
}
