package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        reader.close();
        String run = null;

        url = url.substring(url.indexOf("?") + 1);
        String[] param = url.split("&");
        for (int i = 1; i <= param.length; i++) {
            url = param[i-1].split("=")[0];
            System.out.print(url);
            if (i != param.length) {
                System.out.printf(" ");
            }
            if (url.equals("obj")) {
                run = param[i-1].substring(4);
            }
        }

        //str.matches("[+-]?([0-9]*[.])?[0-9]+") проверка на double
        if (run != null) {
            System.out.println();
            try {
                alert(Double.parseDouble(run));
            } catch (NumberFormatException e) {
                alert(run);
            }
        }
        //add your code here
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
