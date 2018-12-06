package com.javarush.task.task15.task1522;

public class Singleton implements Planet {
    private static Singleton ourInstance = new Singleton();

    public static Singleton getInstance() {
        return ourInstance;
    }

    private Singleton() {
    }
}
