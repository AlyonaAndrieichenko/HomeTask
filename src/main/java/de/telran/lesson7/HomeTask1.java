package de.telran.lesson7;
//Переведите число 333 из 16-ричной в 10-ричную
//Переведите число 819 из 10-ричной в 16-ричную
//101101 в двоичной, переведите в 10-ричную
//124 в десятичной, переведите в 2-ичную
public class HomeTask1 {
    public static void main(String[] args) {

        int numbHex = Integer.parseInt("333", 16);
        String strTen = Integer.toString(numbHex, 10);
        System.out.println(strTen);

        int numbTen = Integer.parseInt(strTen, 10);
        String strHex = Integer.toString(numbTen, 16);
        System.out.println(strHex);

        int numbBinary = Integer.parseInt("101101", 2);
        String strTen1 = Integer.toString(numbBinary, 10);
        System.out.println(strTen1);

        int numbTen1 = Integer.parseInt("124", 10);
        String strBinary = Integer.toString(numbTen1, 2);
        System.out.println(strBinary);
    }
}
