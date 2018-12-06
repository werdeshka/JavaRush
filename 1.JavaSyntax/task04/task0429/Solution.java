package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] s = new String[3];

        for (int i = 0; i < s.length; i++) {
            s[i] = reader.readLine();
        }

        try {
            int a, b = 0, c = 0;
            for (int i = 0; i < s.length; i++) {
                a = Integer.parseInt(s[i]);
                if (a > 0) {
                    b += 1;
                } else if (a < 0) {
                    c += 1;
                }
            }
            System.out.printf("количество отрицательных чисел: %d\nколичество положительных чисел: %d", c, b);
        } catch (NumberFormatException e) {
            System.out.println("Ввели не число!");
        }
        //напишите тут ваш код

    }
}
