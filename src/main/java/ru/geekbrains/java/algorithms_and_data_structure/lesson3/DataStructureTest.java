package ru.geekbrains.java.algorithms_and_data_structure.lesson3;

import ru.geekbrains.java.algorithms_and_data_structure.lesson3.deque.MyArrayDeque;
import ru.geekbrains.java.algorithms_and_data_structure.lesson3.deque.MyArrayListDeque;
import ru.geekbrains.java.algorithms_and_data_structure.lesson3.deque.MyDeque;
import ru.geekbrains.java.algorithms_and_data_structure.lesson3.deque.MyLinkedListDeque;
import ru.geekbrains.java.algorithms_and_data_structure.lesson3.queue.*;
import ru.geekbrains.java.algorithms_and_data_structure.lesson3.stack.MyArrayListStack;
import ru.geekbrains.java.algorithms_and_data_structure.lesson3.stack.MyLinkedListStack;
import ru.geekbrains.java.algorithms_and_data_structure.lesson3.stack.MyStack;

import java.time.Duration;
import java.time.Instant;

public class DataStructureTest {
    public static void main(String[] args) {
        //тестирование скрости stack
        int[] arr = getInts(1000000);
        System.out.println("тестирование скрости stack, колличество элементов " + arr.length);
        System.out.println("    MyArrayListStack");
        Instant start = Instant.now();
        MyStack<Integer> myStack = new MyArrayListStack();
        System.out.print("      Вход первые 10: ");
        for (int i = 0; i < arr.length; i++) {
            if (i < 10) {
                System.out.print(arr[i] + ", ");
            }
            myStack.push(arr[i]);
            myStack.isEmpty();
            myStack.size();
            myStack.peek();
        }
        System.out.println();
        System.out.print("      Выход первые 10: ");
        int countPrint = 10;
        while (!myStack.isEmpty()) {
            int item = myStack.pop();
            if (countPrint != 0){
                System.out.print(item + ", ");
                countPrint--;
            }
            myStack.size();
            myStack.peek();
        }
        Instant finish = Instant.now();
        long elapsed = Duration.between(start, finish).toMillis();
        System.out.println("\n      Прошло времени, мс: " + elapsed);

        System.out.println("    MyLinkedListStack");
        start = Instant.now();
        myStack = new MyLinkedListStack();
        System.out.print("      Вход первые 10: ");
        for (int i = 0; i < arr.length; i++) {
            if (i < 10) {
                System.out.print(arr[i] + ", ");
            }
            myStack.push(arr[i]);
            myStack.isEmpty();
            myStack.size();
            myStack.peek();
        }

        System.out.println();
        System.out.print("      Выход первые 10: ");
        countPrint = 10;
        while (!myStack.isEmpty()) {
            int item = myStack.pop();
            if (countPrint != 0) {
                System.out.print(item + ", ");
                countPrint--;
            }
            myStack.pop();
            myStack.size();
            myStack.peek();
        }
        finish = Instant.now();
        elapsed = Duration.between(start, finish).toMillis();
        System.out.println("\n      Прошло времени, мс: " + elapsed);
        System.out.println();


        //тестирование скрости queue
        arr = getInts(100000);
        System.out.println("тестирование скрости queue, колличество элементов " + arr.length);
        System.out.println("    MyArrayListQueue");
        start= Instant.now();
        MyQueue<Integer> myQueue = new MyArrayListQueue();
        System.out.print("      Вход первые 10: ");
        for (int i = 0; i < arr.length; i++) {
            if (i < 10) {
                System.out.print(arr[i] + ", ");
            }
            myQueue.insert(arr[i]);
            myQueue.isEmpty();
            myQueue.size();
            myQueue.peek();
        }

        System.out.println();
        System.out.print("      Выход первые 10: ");
        countPrint = 10;
        while (!myQueue.isEmpty()) {
            int item = myQueue.remove();
            if (countPrint != 0) {
                System.out.print(item + ", ");
                countPrint--;
            }
            if (myQueue.size() != 0) myQueue.peek();
        }
        finish = Instant.now();
        elapsed = Duration.between(start, finish).toMillis();
        System.out.println("\n      Прошло времени, мс: " + elapsed);

        System.out.println("    MyLinkedListQueue");
        start = Instant.now();
        myQueue = new MyLinkedListQueue();
        System.out.print("      Вход первые 10: ");
        for (int i = 0; i < arr.length; i++) {
            if (i < 10) {
                System.out.print(arr[i] + ", ");
            }
            myQueue.insert(arr[i]);
            myQueue.isEmpty();
            myQueue.size();
            myQueue.peek();
        }
        System.out.println();
        System.out.print("      Выход первые 10: ");
        countPrint = 10;
        while (!myQueue.isEmpty()) {
            int item = myQueue.remove();
            if (countPrint != 0) {
                System.out.print(item + ", ");
                countPrint--;
            }if (myQueue.size() != 0) myQueue.peek();
        }
        finish = Instant.now();
        elapsed = Duration.between(start, finish).toMillis();
        System.out.println("\n      Прошло времени, мс: " + elapsed);
        System.out.println();

        //тестирование скрости priorityQueue
        arr = getInts(10000);
        System.out.println("тестирование скрости priorityQueue, колличество элементов " + arr.length);
        System.out.println("    MyArrayListPriorityQueue");
        start = Instant.now();
        myQueue = new MyArrayListPriorityQueue();
        System.out.print("      Вход первые 10: ");
        for (int i = 0; i < arr.length; i++) {
            if (i < 10) {
                System.out.print(arr[i] + ", ");
            }
            myQueue.insert(arr[i]);
            myQueue.isEmpty();
            myQueue.size();
            myQueue.peek();
        }

        System.out.println();
        System.out.print("      Выход первые 10: ");
        countPrint = 10;
        while (!myQueue.isEmpty()) {
            int item = myQueue.remove();
            if (countPrint != 0) {
                System.out.print(item + ", ");
                countPrint--;
            }
            if (myQueue.size() != 0) myQueue.peek();
        }
        finish = Instant.now();
        elapsed = Duration.between(start, finish).toMillis();
        System.out.println("\n      Прошло времени, мс: " + elapsed);

        System.out.println("    MyLinkedListPriorityQueue");
        start = Instant.now();
        myQueue = new MyLinkedListPriorityQueue();
        System.out.print("      Вход первые 10: ");
        for (int i = 0; i < arr.length; i++) {
            if (i < 10) {
                System.out.print(arr[i] + ", ");
            }
            myQueue.insert(arr[i]);
            myQueue.isEmpty();
            myQueue.size();
            myQueue.peek();
        }
        System.out.println();
        System.out.print("      Выход первые 10: ");
        countPrint = 10;
        while (!myQueue.isEmpty()) {
            int item = myQueue.remove();
            if (countPrint != 0) {
                System.out.print(item + ", ");
                countPrint--;
            }
            if (myQueue.size() != 0) myQueue.peek();
        }
        finish = Instant.now();
        elapsed = Duration.between(start, finish).toMillis();
        System.out.println("\n      Прошло времени, мс: " + elapsed);
        System.out.println();
        
        
        //тестирование скрости deque
        arr = getInts(100000);
        System.out.println("тестирование скрости deque, колличество элементов " + arr.length);
        System.out.println("    MyArrayDeque");
        start = Instant.now();
        MyDeque<Integer> myDeque = new MyArrayDeque(arr.length);
        System.out.print("      Вход первые 10 insertLeft: ");
        for (int i = 0; i < arr.length; i++) {
            if (i < 10) {
                System.out.print(arr[i] + ", ");
            }
            myDeque.insertLeft(arr[i]);
            myDeque.peekLeft();
            myDeque.isEmpty();
            myDeque.size();
        }

        System.out.println();
        System.out.print("      Выход первые 10 removeRight: ");
        countPrint = 10;
        int item;
        while (!myDeque.isEmpty()) {
            item = myDeque.removeRight();
            if (myDeque.size() != 0) myDeque.peekLeft();

            if (countPrint != 0) {
                System.out.print(item + ", ");
                countPrint--;
            }
        }
        System.out.println();
        System.out.print("      Вход первые 10 insertRight: ");
        for (int i = 0; i < arr.length; i++) {
            if (i < 10) {
                System.out.print(arr[i] + ", ");
            }
            myDeque.insertRight(arr[i]);
            myDeque.peekLeft();
            myDeque.isEmpty();
            myDeque.size();
        }

        System.out.println();
        System.out.print("      Выход первые 10 removeLeft: ");
        countPrint = 10;
        while (!myDeque.isEmpty()) {
            item = (int) myDeque.removeLeft();
            if (myDeque.size() != 0) myDeque.peekLeft();

            if (countPrint != 0) {
                System.out.print(item + ", ");
                countPrint--;
            }
        }
        finish = Instant.now();
        elapsed = Duration.between(start, finish).toMillis();
        System.out.println("\n      Прошло времени, мс: " + elapsed);

        System.out.println("    MyArrayListDeque");
        start = Instant.now();
        myDeque = new MyArrayListDeque();
        System.out.print("      Вход первые 10 insertLeft: ");
        for (int i = 0; i < arr.length; i++) {
            if (i < 10) {
                System.out.print(arr[i] + ", ");
            }
            myDeque.insertLeft(arr[i]);
            myDeque.peekLeft();
            myDeque.isEmpty();
            myDeque.size();
        }

        System.out.println();
        System.out.print("      Выход первые 10 removeRight: ");
        countPrint = 10;
        while (!myDeque.isEmpty()) {
            item = myDeque.removeRight();
            if (myDeque.size() != 0) myDeque.peekLeft();

            if (countPrint != 0) {
                System.out.print(item + ", ");
                countPrint--;
            }
        }
        System.out.println();
        System.out.print("      Вход первые 10 insertRight: ");
        for (int i = 0; i < arr.length; i++) {
            if (i < 10) {
                System.out.print(arr[i] + ", ");
            }
            myDeque.insertRight(arr[i]);
            myDeque.peekLeft();
            myDeque.isEmpty();
            myDeque.size();
        }

        System.out.println();
        System.out.print("      Выход первые 10 removeLeft: ");
        countPrint = 10;
        while (!myDeque.isEmpty()) {
            item = (int) myDeque.removeLeft();
            if (myDeque.size() != 0) myDeque.peekLeft();

            if (countPrint != 0) {
                System.out.print(item + ", ");
                countPrint--;
            }
        }
        finish = Instant.now();
        elapsed = Duration.between(start, finish).toMillis();
        System.out.println("\n      Прошло времени, мс: " + elapsed);

        System.out.println("    MyLinkedListDeque");
        start = Instant.now();
        myDeque = new MyLinkedListDeque();
        System.out.print("      Вход первые 10 insertLeft: ");
        for (int i = 0; i < arr.length; i++) {
            if (i < 10) {
                System.out.print(arr[i] + ", ");
            }
            myDeque.insertLeft(arr[i]);
            myDeque.peekLeft();
            myDeque.isEmpty();
            myDeque.size();
        }

        System.out.println();
        System.out.print("      Выход первые 10 removeRight: ");
        countPrint = 10;
        while (!myDeque.isEmpty()) {
            item = myDeque.removeRight();
            if (myDeque.size() != 0) myDeque.peekLeft();

            if (countPrint != 0) {
                System.out.print(item + ", ");
                countPrint--;
            }
        }
        System.out.println();
        System.out.print("      Вход первые 10 insertRight: ");
        for (int i = 0; i < arr.length; i++) {
            if (i < 10) {
                System.out.print(arr[i] + ", ");
            }
            myDeque.insertRight(arr[i]);
            myDeque.peekLeft();
            myDeque.isEmpty();
            myDeque.size();
        }

        System.out.println();
        System.out.print("      Выход первые 10 removeLeft: ");
        countPrint = 10;
        while (!myDeque.isEmpty()) {
            item = myDeque.removeLeft();
            if (myDeque.size() != 0) myDeque.peekLeft();

            if (countPrint != 0) {
                System.out.print(item + ", ");
                countPrint--;
            }
        }
        finish = Instant.now();
        elapsed = Duration.between(start, finish).toMillis();
        System.out.println("\n      Прошло времени, мс: " + elapsed);
    }


    private static int[] getInts(int length) {
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * arr.length);
        }
        return arr;
    }
}

