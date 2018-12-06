package com.javarush.task.task08.task0812;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList();
        try {
            int max = 0, a, b = 0, j = 0;
            for (int i = 0; i < 10; i++) {
                a = Integer.parseInt(reader.readLine());
                list.add(a);
                if (a == b) {
                    j++;
                } else {
                    max = max < j ? j : max;
                    j = 1;
                    b = a;
                }
            }
            max = max < j ? j : max;
            System.out.println(max);
        } catch (NumberFormatException e) {
            System.out.println("Ввели не число!");
        }
        //напишите тут ваш код

    }
}