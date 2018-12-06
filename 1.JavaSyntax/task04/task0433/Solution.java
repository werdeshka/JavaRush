package com.javarush.task.task04.task0433;


/* 
Гадание на долларовый счет
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int i = 0, j = 0;
        String s = "";
        while (i < 10) {
            while (j < 10) {
                j++;
                s += "S";
            }
            i++;
            System.out.println(s);
        }
        //напишите тут ваш код

    }
}
