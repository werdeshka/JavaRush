package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));

        ArrayList<Integer> list =  new ArrayList<Integer>(), threelist =  new ArrayList<Integer>(),
                twolist =  new ArrayList<Integer>(), otherlist =  new ArrayList<Integer>();

        try {
            for (int i = 0; i < 20; i++) {
                int x = Integer.parseInt(reader.readLine());
                list.add(x);
                if (x % 3 == 0) {
                    threelist.add(x);
                }
                if (x % 2 == 0) {
                    twolist.add(x);
                }
                if ((x % 2 != 0) && (x % 3 != 0)) {
                    otherlist.add(x);
                }

            }
            printList(threelist);
            printList(twolist);
            printList(otherlist);
        } catch (NumberFormatException e) {
            System.out.println("Ввели не число!");
        }
        //напишите тут ваш код
    }

    public static void printList(List<Integer> list) {
        for (Integer integer : list) {
            System.out.println(integer);
        }
        //напишите тут ваш код
    }
}
