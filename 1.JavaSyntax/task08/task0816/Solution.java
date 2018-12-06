package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("Stallone2", df.parse("January 2 1981"));
        map.put("Stallone3", df.parse("February 3 1982"));
        map.put("Stallone4", df.parse("March 4 1983"));
        map.put("Stallone5", df.parse("April 5 1984"));
        map.put("Stallone6", df.parse("July 6 1985"));
        map.put("Stallone7", df.parse("August 7 1986"));
        map.put("Stallone8", df.parse("September 8 1987"));
        map.put("Stallone9", df.parse("MAY 11 1988"));
        map.put("Stallone0", df.parse("October 9 1989"));

        return map;
        //напишите тут ваш код
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        map.values().removeIf(e -> ((e.getMonth() >= 5) && (e.getMonth() <= 7)));
        //напишите тут ваш код

    }

    public static void main(String[] args) throws ParseException {
    }
}
