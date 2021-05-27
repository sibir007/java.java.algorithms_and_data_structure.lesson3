package ru.geekbrains.java.algorithms_and_data_structure.lesson3.deque;



public class MyArrayDeque<T> implements MyDeque <T>{
    private final T[] array;
    private int head;
    private int tail;
    private int size;

    public MyArrayDeque(int length){
        this.array = (T[]) new Object[length];
        this.head = 0;
        this.tail = 0;
        this.size = 0;
    }

    @Override
    public void insertLeft(T item) {
        if (this.isFull()) return;
        if (this.isEmpty()){
            this.array[this.head] = item;
            this.size++;
            return;
        }
        if (this.head == 0){
            this.head = array.length - 1;
            this.array[this.head] = item;
            this.size++;
            return;
        }
        this.array[--this.head] = item;
        size++;
    }

    @Override
    public void insertRight(T item) {
        if (this.isFull()) return;
        if (this.isEmpty()){
            this.array[tail] = item;
            this.size++;
            return;
        }
        if (this.tail == this.array.length - 1){
            this.tail = 0;
            this.array[this.tail] = item;
            this.size++;
            return;
        }
        this.array[++tail] = item;
        size++;
    }

    @Override
    public T removeLeft() {
        if (this.isEmpty()) return null;
        if (this.size == 1) {
            size--;
            return this.array[this.head];
        }
        if (this.head == this.array.length - 1){
            this.head = 0;
            size--;
            return  this.array[this.array.length - 1];
        }
        size--;
        return this.array[this.head++];
    }

    @Override
    public T removeRight() {
        if (this.isEmpty()) return null;
        if (this.size == 1) {
            size--;
            return this.array[this.tail];
        }
        if (this.tail == 0){
            this.tail = this.array.length - 1;
            size--;
            return  this.array[0];
        }
        size--;
        return this.array[this.tail--];
    }

    @Override
    public T peekLeft() {
        if (this.isEmpty()) return null;
        return this.array[this.head];
    }

    @Override
    public T peekRight() {
        if (this.isEmpty()) return null;
        return this.array[this.tail];
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    public boolean isFull() {
        return this.size == this.array.length;
    }
}
