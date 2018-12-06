package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sYear = reader.readLine();
        int day = 0;
        try {
            int year = Integer.parseInt(sYear);
            if (((year % 100 == 0) && (year % 400 != 0)) || ((year % 100 != 0) && (year % 4 != 0))) {
                day = 365;
            } else if (((year % 100 == 0) && (year % 400 == 0)) || ((year % 100 != 0) && (year % 4 == 0))) {
                day = 366;
            }
            System.out.println("количество дней в году: " + day);
        } catch (NumberFormatException e) {
            System.out.println("Это не число!");
        }
        //напишите тут ваш код
    }
}