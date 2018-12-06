package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;
import java.nio.file.Files;

import static java.lang.Math.max;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sa = reader.readLine();
        String sb = reader.readLine();
        String sc = reader.readLine();
        String sd = reader.readLine();

        try {
            int a = Integer.parseInt(sa);
            int b = Integer.parseInt(sb);
            int c = Integer.parseInt(sc);
            int d = Integer.parseInt(sd);
            System.out.println(max(max(a, b), max(c,d)));
        } catch (NumberFormatException e) {
            System.out.println("Ввели не число!");
        }
        //напишите тут ваш код
    }
}
