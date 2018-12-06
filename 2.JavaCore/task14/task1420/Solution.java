package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            int a = Integer.parseInt(reader.readLine());
            int b = Integer.parseInt(reader.readLine());
            reader.close();
            if ((a > 0) && (b > 0)) {
                int t;
                while (b != 0) {
                    t = b;
                    b = a % b;
                    a = t;
                }
                System.out.println(a);
            } else {
                throw new Exception();
            }
    }
}
