package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sa = reader.readLine();

        try {
            int a = Integer.parseInt(sa);
            String out = "";
            if (a == 0) {
                out = "ноль";
            } else {
                if (a > 0) {
                    out = "положительное ";
                } else if (a < 0) {
                    out = "отрицательное ";
                }
                if (a % 2 == 0) {
                    out += "четное число";
                } else {
                    out += "нечетное число";
                }
            }
            System.out.println(out);
        } catch (NumberFormatException e) {
            System.out.println("Ввели не число!");
        }
        //напишите тут ваш код
    }
}
