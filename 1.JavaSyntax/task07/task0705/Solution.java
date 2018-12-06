package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] a = new int[20], b = new int[10], c = new int[10];

        try {
            for (int i = 0; i < 20; i++) {
                a[i] = Integer.parseInt(reader.readLine());
                if (i < 10) {
                    b[i] = a[i];
                } else {
                    c[i - 10] = a[i];
                }
            }
            for (int i = 0; i < 10; i++) {
                System.out.println(c[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println("Ввели не число!");
        }
        //напишите тут ваш код
    }
}
