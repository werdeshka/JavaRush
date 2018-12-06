package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> list = new ArrayList<>();
        int[] mas = {5, 5, 5, 5, 5};
        list.add(mas);
        mas = new int[]{2, 2};
        list.add(mas);
        mas = new int[]{4, 4, 4, 4};
        list.add(mas);
        mas = new int[]{7, 7, 7, 7, 7, 7, 7};
        list.add(mas);
        mas = new int[]{};
        list.add(mas);

        return list;
        //напишите тут ваш код

    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
