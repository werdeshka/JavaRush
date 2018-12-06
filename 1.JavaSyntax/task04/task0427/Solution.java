package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sa = reader.readLine();

        try {
            int a = Integer.parseInt(sa);
            int b = sa.length();
            String out = "";
            if ((a >= 1) && (a <= 999)) {
                if (a % 2 == 0) {
                    out = "четное ";
                } else {
                    out = "нечетное ";
                }
                switch (b) {
                    case 1:
                        out += "однозначное";
                        break;
                    case 2:
                        out += "двузначное";
                        break;
                    case 3:
                        out += "трехзначное";
                        break;
                }
                System.out.println(out + " число");
            }
        } catch (NumberFormatException e) {
            System.out.println("Ввели не число!");
        }
        //напишите тут ваш код

    }
}
