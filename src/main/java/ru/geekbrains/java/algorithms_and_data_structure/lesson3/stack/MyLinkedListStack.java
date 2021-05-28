package ru.geekbrains.java.algorithms_and_data_structure.lesson3.stack;


import java.util.LinkedList;

public class MyLinkedListStack<T> implements MyStack <T>{
    private final LinkedList <T> linkedList;

    public MyLinkedListStack() {
        this.linkedList = new LinkedList<T>();
    }

    @Override
    public void push(T item) {
        this.linkedList.add(item);
    }

    @Override
    public T pop() {
        if (this.linkedList.size() == 0) return null;
        return this.linkedList.remove(this.linkedList.size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return this.linkedList.size() == 0;
    }

    @Override
    public int size() {
        return this.linkedList.size();
    }

    @Override
    public T peek() {
        if (this.linkedList.size() == 0) return null;
        return this.linkedList.get(this.linkedList.size() - 1);
    }
}
