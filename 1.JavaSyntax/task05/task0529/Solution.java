package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sa;
        int sum = 0;
        boolean isExit = false;

        while (!isExit) {
            sa = reader.readLine();
            if (sa.equals("сумма")) {
                isExit = true;
                System.out.println(sum);
            } else {
                try {
                    sum += Integer.parseInt(sa);
                } catch (NumberFormatException e) {
                    System.out.println("Ввели не число! Введи число или слово \"сумма\"");
                }
            }
        }
        //напишите тут ваш код
    }
}
