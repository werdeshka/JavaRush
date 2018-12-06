package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        Collections.sort(array);
        // find minimum here — найти минимум тут
        return array.get(0);
    }

    public static List<Integer> getIntegerList() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        try {
            int n = Integer.parseInt(reader.readLine());
            for (int i = 0; i < n; i++) {
                list.add(Integer.parseInt(reader.readLine()));
            }
        } catch (NumberFormatException e) {
            System.out.println("Ввели не число!");
        }
        //create and initialize a list here - создать и заполнить список тут
        return list;
    }
}
