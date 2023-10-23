package de.telran.lesson13;
//Представим, что у нас есть устройство, в котором две колбы.
//Прибор работает корректно, если температура первой колбы выше 100 градусов, а температура второй колбы меньше 100 градусов.
//Вы должны написать метод, который проверяет это устройство.
//Ваша программа должна иметь переменные temperature1 и temperature2.
//В результате метод возвращает true или false.
public class HomeTask1 {
    public static void main(String[] args) {
        System.out.println(isWorking(101,19));
    }

    private static boolean isWorking (int temperature1, int temperature2) {
        if (temperature1 > 100 && temperature2 < 20) {
            return true;
        } else {
            return false;
        }
    }
}
