package com.javarush.task.task03.task0325;

import java.io.*;

/* 
Финансовые ожидания
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sN = reader.readLine();

        try {
            System.out.println("Я буду зарабатывать $" + Integer.parseInt(sN) + " в час");
        } catch (NumberFormatException e) {
            System.out.println("Ввели не число!");
        }
        //напишите тут ваш код
    }
}
