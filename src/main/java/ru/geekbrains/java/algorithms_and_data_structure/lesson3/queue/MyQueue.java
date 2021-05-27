package ru.geekbrains.java.algorithms_and_data_structure.lesson3.queue;

public interface MyQueue <T> {
    void insert(T item);
    T remove();
    T peek();
    boolean isEmpty();
    int size();
}
