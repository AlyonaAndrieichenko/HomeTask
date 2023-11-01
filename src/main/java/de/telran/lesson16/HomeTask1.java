package de.telran.lesson16;

//Дан массив размера  n-1, содержащий только различные целые числа в диапазоне
// от 1 до n . Найдите недостающий элемент.
//input:
//arr[] = {1,2,3,5}
//out: 4
//
//arr[] = {6,1,2,8,3,4,7,10,5}
//out: 9

import java.util.Arrays;
import java.util.Random;

public class HomeTask1 {

    public static void main(String[] args) {
        int n = 10;
        int tmp = 0;
        int[] arr = new int[n - 1];
        Random random = new Random();
        for (int i = 0; i < n - 1; i++) {
            tmp = random.nextInt(n + 1);
            if (searchLine(arr, tmp) == -1) {
                arr[i] = tmp;
            } else i--;
        }
        System.out.println(Arrays.toString(arr));

        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Недостающий элемент: "+((n * (n + 1) / 2) - sum));
    }

    public static int searchLine(int[] arr, int find) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == find) {
                return i;
            }
        }
        return -1;
    }
}




