package de.telran.lesson7;

//Напишите программу, которая вычисляет, сколько лишних калорий будет,
// если вместо пиццы диаметром 24 см вы купите пиццу диаметром 28 см.
//Чтобы решить эту проблему, предположим, что каждый квадратный сантиметр
// пиццы содержит 40 калорий.

public class HomeTask2 {
    public static void main(String[] args) {
        System.out.println("Количество лишних калорий: "+pizza(24, 28));
    }
    static double pizza (double diameter1, double diameter2) {
        double square1 = (Math.pow(diameter1, 2)/4*Math.PI)*40;
        double square2 = (Math.pow(diameter2, 2)/4*Math.PI)*40;
        return square2 - square1;
    }
}
