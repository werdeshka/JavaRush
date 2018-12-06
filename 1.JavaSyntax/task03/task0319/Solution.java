package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        String sNumber1 = reader.readLine();
        String sNumber2 = reader.readLine();

        try {
            int number1 = Integer.parseInt(sNumber1);
            int number2 = Integer.parseInt(sNumber2);
            System.out.println(name + " получает " + number1 + " через " + number2 + " лет.");
        } catch (NumberFormatException e) {
            System.out.println("Ввели не число!");
        }
        //напишите тут ваш код
    }
}
