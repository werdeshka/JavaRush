package com.javarush.task.task09.task0920;

/* 
Обратный отсчёт
*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 10; i >= 0; i--) {
            try {
                System.out.println(i);
                Thread.sleep(100);
            } catch (Exception e){}


            //напишите тут ваш код
        }
    }
}
