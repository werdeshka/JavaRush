package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String vowels = "", NoVowels = "";

        String s = reader.readLine();
        s = s.replace(" ", "");
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (isVowel(chars[i])) {
                vowels += chars[i] + " ";
            } else {
                NoVowels += chars[i] + " ";
            }
        }
        System.out.println(vowels);
        System.out.println(NoVowels);
        //напишите тут ваш код
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}