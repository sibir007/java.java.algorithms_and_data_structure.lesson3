package ru.geekbrains.java.algorithms_and_data_structure.lesson3.deque;


import java.util.LinkedList;

public class MyLinkedListDeque<T> implements MyDeque <T>{
    private final LinkedList <T> linkedList;

    public MyLinkedListDeque(){
        this.linkedList = new LinkedList<>();
    }

    @Override
    public void insertLeft(T item) {
        this.linkedList.add(0, item);
    }

    @Override
    public void insertRight(T item) {
        this.linkedList.add(item);
    }

    @Override
    public T removeLeft() {
        return this.linkedList.remove(0);
    }

    @Override
    public T removeRight() {
        return this.linkedList.remove(this.linkedList.size() - 1);
    }

    @Override
    public T peekLeft() {
        return this.linkedList.get(0);
    }

    @Override
    public T peekRight() {
        return this.linkedList.get(this.linkedList.size() - 1);
    }

    @Override
    public int size() {
        return this.linkedList.size();
    }

    @Override
    public boolean isEmpty() {
        return this.linkedList.size() == 0;
    }
}
