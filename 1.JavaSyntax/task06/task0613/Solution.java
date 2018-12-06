package com.javarush.task.task06.task0613;

/* 
Кот и статика
*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Cat cat = new Cat();
        }

        System.out.println(Cat.getCatCount());
        //создай 10 котов

        //выведи значение переменной catCount
    }

    public static class Cat {
        public static  int catCount = 0;

        public Cat() {
            catCount++;
        }

        public static int getCatCount() {
            return catCount;
        }

        //создай статическую переменную catCount

        //создай конструктор
    }
}
