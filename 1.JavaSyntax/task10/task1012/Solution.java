package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        int[] count = new int[33];
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
            abcArray = s.toCharArray();
            for (int j = 0; j < abcArray.length; j++) {
                int index = alphabet.indexOf(abcArray[j]);
                if (index >= 0) {
                    count[index]++;
                }
            }
        }

        for (int i = 0; i < alphabet.size(); i++) {
            System.out.println(alphabet.get(i) + " " + count[i]);
        }

        // напишите тут ваш код
    }

}
