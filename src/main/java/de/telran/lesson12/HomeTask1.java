package de.telran.lesson12;

//Создайте две переменные isEdekaOpen и isReweOpen, значения которых зависят от того, открыты магазины или нет.
//Реализует логический метод canBuy,  возвращающий boolean
//Значение этой переменной должно быть true, если хотя бы один магазин открыт, иначе false.
//Отобразите строку «Я могу купить еду, это ……» и значение.

public class HomeTask1 {
    public static void main(String[] args) {
        System.out.println("Я могу купить еду, это "+canBuy(false, false));
    }
    private static boolean canBuy(boolean isEdekaOpen, boolean isReweOpen) {
        if (isEdekaOpen == true || isReweOpen == true) {
            return true;
        } else {
            return false;
        }
    }
}
