package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0, a = 0;

        try {
            while (a != -1) {
                a = Integer.parseInt(reader.readLine());
                sum += a;
            }
        } catch (NumberFormatException e) {
            System.out.println("Ввели не число!");
        }

        System.out.println(sum);
        //напишите тут ваш код
    }
}
