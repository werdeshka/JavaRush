package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] s = new String[3];
        for (int i = 0; i < 3; i++) {
            s[i] = reader.readLine();
        }

        try {
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            int c = Integer.parseInt(s[2]);

            int max = max(a, max(b, c));
            int min = min(a, min(b, c));

            System.out.println(a + b + c - min - max);
        } catch (NumberFormatException e) {
            System.out.println("Ввели не число!");
        }
        //напишите тут ваш код
    }
}
