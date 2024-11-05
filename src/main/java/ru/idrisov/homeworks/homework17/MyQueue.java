package ru.idrisov.homeworks.homework17;

import java.util.*;

public class MyQueue<T> {

    private Queue<String> queue = new LinkedList<>();

    public Queue<String> offer(T data) {
        queue.offer(data.toString());
        return queue;
    }

    public T poll() {
        return (T) queue.poll();
    }


}
