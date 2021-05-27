package ru.geekbrains.java.algorithms_and_data_structure.lesson3.deque;

public interface MyDeque <T>{
    void insertLeft(T item);
    void insertRight(T item);
    T removeLeft();
    T removeRight();
    T peekLeft();
    T peekRight();
    int size();
    boolean isEmpty();
}
