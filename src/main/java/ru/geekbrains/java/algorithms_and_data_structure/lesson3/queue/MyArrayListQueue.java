package ru.geekbrains.java.algorithms_and_data_structure.lesson3.queue;

import java.util.ArrayList;

public class MyArrayListQueue <T> implements MyQueue<T> {
    private final ArrayList <T> arrayList;

    public MyArrayListQueue() {
        this.arrayList = new ArrayList<>();
    }


    @Override
    public void insert(T item) {
        this.arrayList.add(item);
    }

    @Override
    public T remove() {
        T item = this.arrayList.remove(0);
        return item;
    }

    @Override
    public T peek() {
        return this.arrayList.get(0);
    }

    @Override
    public boolean isEmpty() {
        return this.arrayList.size() == 0;
    }

    @Override
    public int size() {
        return this.arrayList.size();
    }
}
