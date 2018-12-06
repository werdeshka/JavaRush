package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int count = -1, sum = 0, a = 0;
        boolean isExit = false;

        try {
            while (a != -1) {
                sum += a;
                count++;
                a = Integer.parseInt(reader.readLine());
            }
            System.out.println(1.0 * sum / count);
        } catch (NumberFormatException e) {
            System.out.println("Ввели не число");
        }

        //напишите тут ваш код
    }
}

