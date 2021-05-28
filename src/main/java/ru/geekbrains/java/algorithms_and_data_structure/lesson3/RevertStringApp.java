package ru.geekbrains.java.algorithms_and_data_structure.lesson3;

import ru.geekbrains.java.algorithms_and_data_structure.lesson3.stack.MyArrayListStack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RevertStringApp {
    public static void run(){
        MyArrayListStack stack = new MyArrayListStack();
        String str = "";

        try (InputStreamReader in = new InputStreamReader(System.in)){
            while (!(str.compareTo("exit") == 0)) {
                System.out.print("enter string or 'exit'> ");
                int i;
                StringBuilder stringBuilder = new StringBuilder();
                while ((i = in.read()) != -1) {
                    if (i == (int)'\n') break;
                    stack.push((char)i);
                    stringBuilder.append((char) i);
                }
                System.out.print("revert string> ");
                while (!stack.isEmpty()) {
                    System.out.print(stack.pop());
                }
                System.out.println();
                str = stringBuilder.toString();
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
