package com.javarush.task.task04.task0424;

/* 
Три числа
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

            if ((a != b) && (a != c) && (b == c)) {
                System.out.println(1);
            } else if ((a != b) && (b != c) && (a == c)) {
                System.out.println(2);
            } else if ((a != c) && (b != c) && (b == a)) {
                System.out.println(3);
            }
        } catch (NumberFormatException e) {
            System.out.println("Ввели не число!");
        }
        //напишите тут ваш код
    }
}
