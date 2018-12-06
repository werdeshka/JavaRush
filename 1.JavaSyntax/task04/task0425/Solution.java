package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;

import static java.lang.Integer.parseInt;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sa = reader.readLine();
        String sb = reader.readLine();

        try {
            int a = parseInt(sa);
            int b = parseInt(sb);

            if ((a > 0) && (b > 0)) {
                System.out.println(1);
            } else if ((a < 0) && (b > 0)) {
                System.out.println(2);
            } else if ((a < 0) && (b < 0)) {
                System.out.println(3);
            } else if ((a > 0) && (b < 0)) {
                System.out.println(4);
            }
        } catch (NumberFormatException e) {
            System.out.println("Ввели не число!");
        }
        //напишите тут ваш код
    }
    public static int n_int() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return parseInt(reader.readLine());
    }
}
