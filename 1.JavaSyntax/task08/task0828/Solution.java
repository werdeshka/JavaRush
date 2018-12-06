package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>(); // для валидатора
        String month = reader.readLine();
        Date data = new Date(month + " 2 2015");
        System.out.println(month + " is the " + (data.getMonth() + 1) + " month");
        //напишите тут ваш код
    }
}
