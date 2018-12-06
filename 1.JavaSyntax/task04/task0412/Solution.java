package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNume = reader.readLine();
        try {
            int num = Integer.parseInt(sNume);
            if (num > 0) {
                num *= 2;
            } else if (num < 0) {
                num += 1;
            }
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Ввели не число!");
        }
        //напишите тут ваш код

    }

}