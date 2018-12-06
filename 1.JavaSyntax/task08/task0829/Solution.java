package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        List<String> addresses = new ArrayList<String>();
        List<String> townfamily = new ArrayList<>();
        while (true) {
            String town = reader.readLine();
            if (town.isEmpty()) break;

            townfamily.add(town);

            String family = reader.readLine();
            addresses.add(family);
        }

        //read home number
        String town = reader.readLine();
        for (int i = 0; i < townfamily.size(); i++) {
            if (townfamily.get(i).equals(town)) {
                System.out.println(addresses.get(i));
            }
        }
    }
}
