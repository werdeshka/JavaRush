package com.javarush.task.task12.task1226;

/* 
Лазать, летать и бегать
*/

public class Solution {

    interface Fly {
        void fly();
    }

    interface Climb {
        void climb();
    }

    interface Run {
        void run();
    }


    public static void main(String[] args) {

    }

    public class Cat implements Run, Climb {
        @Override
        public void climb() {

        }

        @Override
        public void run() {

        }
    }

    public class Dog implements Run {
        @Override
        public void run() {

        }
    }

    public class Tiger extends Cat {
    }

    public class Duck implements Run, Fly {
        @Override
        public void fly() {

        }

        @Override
        public void run() {

        }
    }
}
