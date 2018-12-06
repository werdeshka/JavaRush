package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] a = new int[20];

        try {
            int maximum = Integer.parseInt(reader.readLine());
            int minimum = maximum;
            a[0] = maximum;
            for (int i = 1; i < 20; i++) {
                a[i] = Integer.parseInt(reader.readLine());
                maximum = maximum < a[i] ? a[i] : maximum;
                minimum = minimum > a[i] ? a[i] : minimum;
            }
            System.out.print(maximum + " " + minimum);
        } catch (NumberFormatException e) {
            System.out.println("Ввели не число!");
        }
        //напишите тут ваш код
    }
}
