package com.javarush.task.task01.task0133;

/* 
Не думать о секундах…
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getSecondsAfter15(14442));
    }

    public static int getSecondsAfter15(int secondsAfter12) {
        int secondsAfter15;
        secondsAfter15 = secondsAfter12 - 3 * 60 * 60;
        //напишите тут ваш код


        return secondsAfter15;
    }
}