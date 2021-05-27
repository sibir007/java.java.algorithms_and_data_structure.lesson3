package ru.geekbrains.java.algorithms_and_data_structure.lesson3.queue;

import java.util.Iterator;
import java.util.LinkedList;

public class MyLinkedListPriorityQueue<T extends Comparable<? super T>> implements MyQueue<T> {
    private final LinkedList<T> linkedList;

    public MyLinkedListPriorityQueue() {
        this.linkedList = new LinkedList<>();
    }


    @Override
    public void insert(T item) {
        int index = getIndex(item);
        this.linkedList.add(index, item);
    }

    private int getIndex(T item){
        int index = 0;
        Iterator<T> iterator = this.linkedList.iterator();
        while (iterator.hasNext()){
            if (iterator.next().compareTo(item) <= 0) break;
            index++;
        }
        return index;
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
