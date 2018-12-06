package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private String surname;
        private byte age;
        private int growth;
        private int weight;
        private boolean children;

        public Human(String name) {}

        public Human(String name, String surname) {}

        public Human(String name, boolean children) {}

        public Human(String name, String surname, byte age) {}

        public Human(String name, byte age, boolean children) {}

        public Human(String name, String surname, boolean children) {}

        public Human(String name, String surname, byte age, boolean children) {}

        public Human(String name, String surname, byte age, int growth, int weight) {}

        public Human(String name, String surname, byte age, int growth, boolean children) {}

        public Human(String name, String surname, byte age, int growth, int weight, boolean children) {}
        // напишите тут ваши переменные и конструкторы
    }
}
