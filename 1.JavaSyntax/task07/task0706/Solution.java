package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] a = new int[15];
        int sume = 0, sumo = 0;

        try {
            for (int i = 0; i < 15; i++) {
                a[i] = Integer.parseInt(reader.readLine());
                if (i % 2 == 0) {
                    sume += a[i];
                } else {
                    sumo += a[i];
                }
            }
            if (sume > sumo) {
                System.out.println("В домах с четными номерами проживает больше жителей.");
            } else {
                System.out.println("В домах с нечетными номерами проживает больше жителей.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Ввели не число!");
        }
        //напишите тут ваш код
    }
}
