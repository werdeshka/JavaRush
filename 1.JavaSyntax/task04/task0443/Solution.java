package com.javarush.task.task04.task0443;


/* 
Как назвали, так назвали
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        String sy = reader.readLine();
        String sm = reader.readLine();
        String sd = reader.readLine();

        try {
            int y = Integer.parseInt(sy);
            int m = Integer.parseInt(sm);
            int d = Integer.parseInt(sd);

            System.out.printf("Меня зовут %s.\nЯ родился %d.%d.%d", name, d, m, y);
        } catch (NumberFormatException e) {
            System.out.println("ввели не число!");
        }
        //напишите тут ваш код
    }
}
