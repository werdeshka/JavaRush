package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sa = reader.readLine();
        String sb = reader.readLine();
        String sc = reader.readLine();

        try {
            int a = Integer.parseInt(sa);
            int b = Integer.parseInt(sb);
            int c = Integer.parseInt(sc);

            if ((a + b > c) && (a + c > b) && (c + b > a)) {
                System.out.println("Треугольник существует.");
            } else {
                System.out.println("Треугольник не существует.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Ввели не число!");
        }
        //напишите тут ваш код
    }
}