package com.javarush.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

/* 
Факториал
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

       // int input = Integer.parseInt(reader.readLine());
        reader.close();

        //if (input < 0) {
          //  System.out.println(0);
       // } else if (input <= 150) {
            System.out.println(factorial(10000));
       // }
    }

    public static String factorial(int n) {
        if (n > 0){
            return get(Integer.toString(n), factorial(--n));
        } else {
            return "1";
        }
        //add your code here
    }

    private static String get(String s1, String s2) {
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        int ind, sum = 0, last = 0, temp;
        int len1 = a1.length - 1;
        int len2 = a2.length - 1;
        String out = "";

        for (int i = len1; i >= 0; i--) {
            ind = len2;
            sum = last;
            last =0;
            for (int j = i; (j <= len1) && (ind >= 0); j++) {
                temp = Integer.parseInt(Character.toString(a1[j])) * Integer.parseInt(Character.toString(a2[ind]));
                sum += temp % 10;
                last += temp / 10;
                ind--;
            }
            out = Integer.toString(sum % 10) + out;
            last += sum / 10;
            if ((i == 0) && (len2 >= 0)) {
                i++;
                len2--;
            }
        }
        if (sum == 0) {
            out = out.substring(1);
        }
        return out;
    }
}
