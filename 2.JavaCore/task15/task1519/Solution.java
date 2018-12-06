package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String data;
        while (!"exit".equals(data = reader.readLine())) {
            try {
                if (data.contains(".")) {
                    print(Double.parseDouble(data));
                } else {
                    Integer num = Integer.parseInt(data);
                    if (0 < num && num < 128) {
                        print(Short.parseShort(data));
                    } else {
                        print(num);
                    }
                }

            } catch (NumberFormatException e) {
                print(data);
            }
        }
        reader.close();
        //напиште тут ваш код
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
