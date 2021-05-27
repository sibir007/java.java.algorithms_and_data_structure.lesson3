package ru.geekbrains.java.algorithms_and_data_structure.lesson3;

import ru.geekbrains.java.algorithms_and_data_structure.lesson3.stack.MyArrayListStack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RevertStringApp {
    public static void run(){
       // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        InputStreamReader in = new InputStreamReader(System.in);
        MyArrayListStack stack = new MyArrayListStack();

        try {
            while (true) {
                int i;
                while (((i = in.read()) != -1)) {
                    //if (i = (int)'') return;;
                    if (i == (int)'\n') break;

                    //System.out.print((char)i);

                    stack.push((char)i);
                }
                while (!stack.isEmpty()) {
                    System.out.print(stack.pop());
                }
                System.out.println();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        RevertStringApp.run();
    }
}
