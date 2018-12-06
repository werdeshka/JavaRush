package com.javarush.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Меняем функциональность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        ArrayList<String> listReplace = new ArrayList<String>();
        for (String s : list) {
            if (s.length() % 2 == 0) {
                listReplace.add(s + " " + s);
            } else {
                listReplace.add(s + " " + s + " " + s);
            }
        }

        for (String s : listReplace) {
            System.out.println(s);
        }
    }
}
