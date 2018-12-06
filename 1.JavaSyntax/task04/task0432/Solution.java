package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String s = reader.readLine();
        String sa = reader.readLine();
        
        try {
            int a = Integer.parseInt(sa);
            while (a > 0){
                System.out.println(s);
                a--;
            }
        } catch (NumberFormatException e) {
            System.out.println("Ввели не число");
        }
        //напишите тут ваш код

    }
}
