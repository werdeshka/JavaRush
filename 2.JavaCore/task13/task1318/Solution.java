package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        reader.close();

        InputStream read = new BufferedInputStream(new FileInputStream(file));
        while (read.available() > 0) {
            System.out.print((char)read.read());
        }

        read.close();
        // напишите тут ваш код
    }
}