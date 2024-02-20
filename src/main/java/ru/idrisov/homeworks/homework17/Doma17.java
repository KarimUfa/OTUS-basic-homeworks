package ru.idrisov.homeworks.homework17;

import java.util.Arrays;

public class Doma17 {
    public static int[] sorts(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1] < array[j]) {
                    int swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
            }
        }
        return array;
    }


    public static void main(String[] args) {

        MyLinkedList dates = new MyLinkedList();

        dates.adds("Текст 1");
        dates.adds("Текст 2");
        dates.adds("Текст 3");

        System.out.println(dates.addFirst("Текст 1"));
        System.out.println(dates.addLast("Текст 2"));
        System.out.println(dates.getFirst());
        System.out.println(dates.getLast());
        System.out.println(dates.add(2, "Текст 5"));
        System.out.println(dates.remove(2));
        System.out.println(dates.get(2));
        System.out.println(dates.getSize());

        MyQueue queue = new MyQueue<>();
        System.out.println(queue.offer("Текст 6"));
        System.out.println(queue.offer("Текст 7"));
        System.out.println(queue.poll());

        MyStack stack = new MyStack();
        System.out.println(stack.push(123));
        System.out.println(stack.pop());


        int[] sortArr = {12, 6, 4, 1, 15, 10};
        System.out.println(Arrays.toString(sorts(sortArr)));

    }


}
