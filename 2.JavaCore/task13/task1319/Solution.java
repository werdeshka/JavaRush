package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();

        BufferedWriter out = new BufferedWriter(new FileWriter(file));
        String result = "";
        String string = reader.readLine();
        while (!string.equals("exit")) {
            String lineSeparator = System.getProperty("line.separator");
            result += string + lineSeparator;
            string = reader.readLine();
        }
        result += "exit";
        out.write(result);
        reader.close();
        out.close();
        // напишите тут ваш код
    }
}
