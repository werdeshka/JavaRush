package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        int min, max;

        list.add(reader.readLine());
        max = min = list.get(0).length();

        for (int i = 1; i < 10; i++) {
            list.add(reader.readLine());
            max = max < list.get(i).length() ? list.get(i).length() : max;
            min = min > list.get(i).length() ? list.get(i).length() : min;
        }

        for (int i = 0; i < list.size(); i++) {
            if ((list.get(i).length() == max) || (list.get(i).length() == min)) {
                System.out.println(list.get(i));
                break;
            }
        }
        //напишите тут ваш код
    }
}
