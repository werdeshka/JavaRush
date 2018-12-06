package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sa = reader.readLine();

        try {
            int a = Integer.parseInt(sa);
            while (a != 0) {
                if ((a % 2) == 0) {
                    even++;
                } else {
                    odd++;
                }
                a = a / 10;
            }
            System.out.printf("Even: %d Odd: %d", even, odd);
        } catch (NumberFormatException e) {
            System.out.println("Ввели не число!");
        }
        //напишите тут ваш код
    }
}
