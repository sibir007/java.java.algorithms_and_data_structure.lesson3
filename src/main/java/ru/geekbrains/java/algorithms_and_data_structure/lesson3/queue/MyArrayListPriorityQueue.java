package ru.geekbrains.java.algorithms_and_data_structure.lesson3.queue;

import java.util.ArrayList;
import java.util.Iterator;

public class MyArrayListPriorityQueue<T extends Comparable<? super T>> implements MyQueue<T> {
    private final ArrayList <T> arrayList;

    public MyArrayListPriorityQueue() {
        this.arrayList = new ArrayList<>();
    }


    @Override
    public void insert(T item) {
        int index = getIndex(item);
        this.arrayList.add(index, item);
    }

    private int getIndex(T item){
        int index = 0;
        Iterator<T> iterator = this.arrayList.iterator();
        while (iterator.hasNext()){
            if (iterator.next().compareTo(item) <= 0) break;
            index++;
        }
        return index;
    }

    @Override
    public T remove() {
        return  this.arrayList.remove(0);
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
