package ru.geekbrains.java.algorithms_and_data_structure.lesson3.queue;

import java.util.ArrayList;
import java.util.LinkedList;

public class MyLinkedListQueue<T> implements MyQueue<T> {
    private final LinkedList <T> linkedList;

    public MyLinkedListQueue() {
        this.linkedList = new LinkedList<>();
    }


    @Override
    public void insert(T item) {
        this.linkedList.add(item);
    }

    @Override
    public T remove() {
        T item = this.linkedList.remove(0);
        return item;
    }

    @Override
    public T peek() {
        return this.linkedList.get(0);
    }

    @Override
    public boolean isEmpty() {
        return this.linkedList.size() == 0;
    }

    @Override
    public int size() {
        return this.linkedList.size();
    }
}
