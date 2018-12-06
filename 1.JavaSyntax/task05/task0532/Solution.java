package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int a;

        if (n > 0) {
            int maximum = Integer.parseInt(reader.readLine());
            for (int i = 1; i < n; i++) {
                a = Integer.parseInt(reader.readLine());
                maximum = maximum < a ? a : maximum;
            }
            System.out.println(maximum);
        }

        //напишите тут ваш код


    }
}
