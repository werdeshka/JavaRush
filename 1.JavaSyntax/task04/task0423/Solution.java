package com.javarush.task.task04.task0423;

/* 
Фейс-контроль
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        String sAge = reader.readLine();

        try {
            int age = Integer.parseInt(sAge);

            if (age > 20) {
                System.out.println("И 18-ти достаточно");
            }
        } catch (NumberFormatException e) {
            System.out.println("Ввели не число!");
        }
        //напишите тут ваш код
    }
}
