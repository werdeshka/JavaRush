package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
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

            if (a == b && b == c) {
                System.out.println(a + " " + b + " " + c);
            } else {
                pare(a, b);
                pare(a, c);
                pare(c, b);
            }
        } catch (NumberFormatException e) {
            System.out.println("Ввели не число!");
        }
        }

    private static void pare(int a, int b) {
        if (a == b) {
            System.out.println(a + " " + b);
        }
    }
    //напишите тут ваш код
}