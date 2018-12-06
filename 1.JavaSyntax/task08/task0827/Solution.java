package com.javarush.task.task08.task0827;

import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("JANUARY 2 2020"));
    }

    public static boolean isDateOdd(String date) {
        Date start = new Date(date), end = new Date(date);
        start.setMonth(0);
        start.setDate(0);
        return ((end.getTime() - start.getTime()) / (1000 * 60 * 60 * 24)) % 2 != 0;
    }
}