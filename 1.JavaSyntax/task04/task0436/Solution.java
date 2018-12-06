package com.javarush.task.task04.task0436;


/* 
Рисуем прямоугольник
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sm = reader.readLine();
        String sn = reader.readLine();

        int m = Integer.parseInt(sm);
        int n = Integer.parseInt(sn);

        try {
            String s = "";
            for (int i = 0; i < n; i++) {
                s += "8";
            }
            for (int i = 0; i < m; i++) {
                System.out.println(s);
            }
        } catch (NumberFormatException e) {
            System.out.println("Ввели не число!");
        }
        //напишите тут ваш код

    }
}
