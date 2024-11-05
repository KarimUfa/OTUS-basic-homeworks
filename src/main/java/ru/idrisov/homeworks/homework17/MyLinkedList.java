package ru.idrisov.homeworks.homework17;

import java.util.List;
import java.util.ArrayList;

public class MyLinkedList<T> {

    private List<String> algorithm = new ArrayList<>();

    public void adds(T data) {
        algorithm.add(data.toString());
    }

    public List<String> addFirst(T data) {
        algorithm.add(0, data.toString());
        return algorithm;
    }

    public List<String> addLast(T data) {
        algorithm.add(data.toString());
        return algorithm;
    }

    public T getFirst() {
        return (T) algorithm.get(0);
    }

    public T getLast() {
        return (T) algorithm.get(algorithm.size() - 1);
    }

    public List<String> add(int position, T data) {
        for (int i = 0; i < algorithm.size(); i++) {
            if (i == position) {
                algorithm.add(position, data.toString());
            }
        }
        return algorithm;
    }

    public T remove(int position) {
        for (int i = 0; i < algorithm.size(); i++) {
            if (i == position) {
                algorithm.remove(i);
            }
        }
        return (T) algorithm;
    }

    public T get(int position) {
        return (T) algorithm.get(position);
    }

    public int getSize() {
        return algorithm.size();
    }

}
