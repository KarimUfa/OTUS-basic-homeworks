package ru.idrisov.homeworks.homework17;

import java.util.*;

public class MyStack<T> {

    private Stack<Integer> stac = new Stack<>();

    public Stack<Integer> push(T data) {
        for (int i = 1; i < 5; i++) {
            stac.add(i);
        }
        stac.add((int) data);
        return stac;
    }


    public T pop() {
        return (T) stac.pop();
    }


}
