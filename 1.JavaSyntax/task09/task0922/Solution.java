package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.BreakIterator;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Date date;
        SimpleDateFormat NewDate1 = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        SimpleDateFormat NewDate2 = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);

        String s = reader.readLine();
        date = NewDate1.parse(s);
        System.out.println(NewDate2.format(date).toUpperCase());
        //напишите тут ваш код
    }
}
