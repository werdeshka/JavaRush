package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        reader.close();
        //String file = "number";
        BufferedReader number = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        ArrayList<Integer> sortFile = new ArrayList<>();
        while (number.ready()) {
            try {
                Integer num = Integer.parseInt(number.readLine());
                if (num % 2 == 0) {
                    sortFile.add(num);
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        number.close();
        Collections.sort(sortFile);

        for (Integer integer : sortFile) {
            System.out.println(integer);
        }

    }
}
