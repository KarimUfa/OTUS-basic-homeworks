package ru.idrisov.homeworks.homework77;

import java.util.Arrays;

public class Doma77 {
    public static int SIZE_X;
    public static int SIZE_Y;

    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3}, {4, 5, 6}};
        sumOfPositiveElements(arr);

        SIZE_X = 10;
        SIZE_Y = 10;
        int[][] size = new int[SIZE_X][SIZE_Y];
        metod2(size);

        int[][] arrays = {{8, 10, 15}, {17, 22, 18}, {8, 10, 22}};
        metod3(arrays);
        metod3d(arrays);

        int[][] array = {{-5, -7, -10}, {-10, -15, -20, -9}};

        findMax(array);
        System.out.println(findMax(array));

        int[][] arrs = {{5, 8, 10}, {3, 2, 8, 2}};

        summArray(arrs);
        System.out.println(summArray(arrs));

    }

    // 1 задание
    public static void sumOfPositiveElements(int[][] arr) {
        int summ = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] > 0) {
                    summ += arr[i][j];
                }
            }
        }
        System.out.println(summ);
    }

    // 2 задание
    public static void metod2(int[][] size) {

        for (int x = 0; x < SIZE_X; x++) {
            for (int y = 0; y < SIZE_Y; y++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    // 3 задание
    public static void metod3(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j || i + j == array.length - 1) {
                    array[i][j] = 0;
                }
            }
        }
    }

    public static void metod3d(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }


    // 4 задание
    public static int findMax(int[][] arr) {
        int max = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    // 5 задание
    public static int summArray(int[][] arrs) {

        int sum = 0;
        if (arrs.length <= 1) {
            sum = -1;
        } else {
            for (int i = 0; i < arrs.length; i++) {
                sum += arrs[1][i];
            }
        }

        return sum;
    }


}
