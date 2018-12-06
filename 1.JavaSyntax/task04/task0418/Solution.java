package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sa = reader.readLine();
        String sb = reader.readLine();

        try {
            int a = Integer.parseInt(sa);
            int b = Integer.parseInt(sb);

            if (a < b) {
                System.out.println(a);
            } else {
                System.out.println(b);
            }
        } catch (NumberFormatException e) {
            System.out.println("Ввели не число");
        }
        //напишите тут ваш код
    }
}