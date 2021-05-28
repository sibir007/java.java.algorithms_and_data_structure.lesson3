package ru.geekbrains.java.algorithms_and_data_structure.lesson3.stack;

public interface MyStack<T>{
    void push(T item);
    T pop();
    boolean isEmpty();
    int size();
    T peek();
}
