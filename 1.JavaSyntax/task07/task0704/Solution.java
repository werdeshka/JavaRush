package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] a = new int[10];

        try {
            for (int i = 0; i < 10; i++) {
                a[i] = Integer.parseInt(reader.readLine());
            }
            for (int i = 0; i < 10; i++) {
                System.out.println(a[9 - i]);
            }
        } catch (NumberFormatException e) {
            System.out.println("Ввели не число!");
        }
        //напишите тут ваш код
    }
}

