package ru.geekbrains.java.algorithms_and_data_structure.lesson3.deque;

import java.util.ArrayList;

public class MyArrayListDeque <T> implements MyDeque <T>{
    private final ArrayList <T> arrayList;

    public MyArrayListDeque(){
        this.arrayList = new ArrayList<>();
    }

    @Override
    public void insertLeft(T item) {
        this.arrayList.add(0, item);
    }

    @Override
    public void insertRight(T item) {
        this.arrayList.add(item);
    }

    @Override
    public T removeLeft() {
        return this.arrayList.remove(0);
    }

    @Override
    public T removeRight() {
        return this.arrayList.remove(this.arrayList.size() - 1);
    }

    @Override
    public T peekLeft() {
        return this.arrayList.get(0);
    }

    @Override
    public T peekRight() {
        return this.arrayList.get(this.arrayList.size() - 1);
    }

    @Override
    public int size() {
        return this.arrayList.size();
    }

    @Override
    public boolean isEmpty() {
        return this.arrayList.size() == 0;
    }
}
