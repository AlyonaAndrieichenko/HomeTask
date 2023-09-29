package de.telran.lesson2;

//* Дано трехзначное число. Вывести на экран все цифры этого числа
//Пример: 345
//Вывод в консоль: Число 345 -> 3, 4, 5

public class HomeTask2 {
    public static void main(String[] args) {
        int arg = 345, arg1 = 100, arg2 = 10;
        int div = arg / arg1;
        int div1 = arg / arg2;
        int ost = div1 % arg2;
        int ost1 = arg % arg2;


        System.out.print(div);
        System.out.print(", "+ost);
        System.out.print(", "+ost1);

    }
}

