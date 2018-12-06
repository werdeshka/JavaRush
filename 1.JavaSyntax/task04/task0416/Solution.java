package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sTime = reader.readLine();

        try {
            double time = Double.parseDouble(sTime);
            time = time % 5;
            if (time >= 0 && time < 3) {
                System.out.println("зеленый");
            } else if (time >= 3 && time < 4) {
                System.out.println("желтый");
            } else {
                System.out.println("красный");
            }
        } catch (NumberFormatException e) {
            System.out.println("Ввели не число!");
        }
        //напишите тут ваш код
    }
}