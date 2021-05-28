package ru.geekbrains.java.algorithms_and_data_structure.lesson3.stack;


import java.util.ArrayList;

public class MyArrayListStack<T> implements MyStack <T>{
    private final ArrayList <T> arrayList;

    public MyArrayListStack() {
        this.arrayList = new ArrayList<T>();
    }

    @Override
    public void push(T item) {
        this.arrayList.add(item);
    }

    @Override
    public T pop() {
        if (this.arrayList.size() == 0) return null;
        return this.arrayList.remove(this.arrayList.size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return this.arrayList.size() == 0;
    }

    @Override
    public int size() {
        return this.arrayList.size();
    }

    @Override
    public T peek() {
        if (this.arrayList.size() == 0) return null;
        return this.arrayList.get(this.arrayList.size() - 1);
    }
}
