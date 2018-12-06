package com.javarush.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Совершенствуем функциональность
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] s = new String[5];

        for (int i = 0; i < 5; i++) {
            s[i] = reader.readLine();
        }
        try {
            int[] a = new int[5];
            for (int i = 0; i < 5; i++) {
                a[i] = Integer.parseInt(s[i]);
            }
            System.out.println("Minimum = " + min(a[0], a[1], a[2], a[3], a[4]));
        } catch (NumberFormatException e) {
            System.out.println("Ввели не число!");
        }
    }


    public static int min(int a, int b, int c, int d, int e) {
        return Math.min(Math.min(Math.min(a, b), Math.min(c, d)), e);
    }
}
