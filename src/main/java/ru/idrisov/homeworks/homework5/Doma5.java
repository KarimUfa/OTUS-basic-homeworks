package ru.idrisov.homeworks.homework5;

import java.util.Arrays;

public class Doma5 {
    public static void main(String[] args) {

        int[] arr = {3, 7, 9, 10, 20, 30};

        metod1(5, "Java");
        metod2(arr);
        metod3(10, new int[]{2,4,1,6,7});
        metod4(15, new int [] {5,10,15,20});
        metod5(arr);


    }

    //1 задача
    public static void metod1(int a, String b) {
        for (int i = 0; i < a; i++) {
            System.out.println(b);
        }
    }

    //2 задача
    public static void metod2(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }

    //3 задача
    public static void metod3(int x, int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = x;
        }
        System.out.println(Arrays.toString(arrays));
    }

    //4 задача
    public static void metod4(int y, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] + y;
        }
        System.out.println(Arrays.toString(array));
    }

    //5 задача
    public static void metod5(int[] arr) {

        int summ1 = 0;
        int summ2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length / 2) {
                summ1 += arr[i];
            } else {
                summ2 += arr[i];
            }
        }

        if (summ1 > summ2){
            System.out.println("Сумма summ1 больше чем summ2");
        } else {
            System.out.println("Сумма summ2 больше чем summ1");
        }

    }
}




