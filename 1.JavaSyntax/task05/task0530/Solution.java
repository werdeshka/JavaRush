package com.javarush.task.task05.task0530;

import java.io.*;

/* 
Шеф, что-то не пашет
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sa = reader.readLine();
        String sb = reader.readLine();

        try {
            int sum = Integer.parseInt(sa) + Integer.parseInt(sb);
            System.out.println("Sum = " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Ввели не число!");
        }

    }
}
