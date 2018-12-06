package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    private String name, address, color;
    private int age, weight = 6;

    public void initialize (String name) {
        this.name = name;
        age = 3;
        weight = 6;
        color = "grey";
    }

    public void initialize (String name, int weight, int age) {
        this.name = name;
        this.age = age >=0 ? age : 3;
        this.weight = weight > 0 ? weight : 6;
        color = "grey";
    }

    public void initialize (String name, int age) {
        this.name = name;
        this.age = age >=0 ? age : 3;
        weight = 6;
        color = "grey";
    }

    public void initialize (int weight, String color) {
        age = 3;
        this.weight = weight > 0 ? weight : 6;
        this.color = color;
    }

    public void initialize (int weight, String color, String address) {
        age = 3;
        this.weight = weight > 0 ? weight : 6;
        this.color = color;
        this.address = address;
    }
    //напишите тут ваш код

    public static void main(String[] args) {

    }
}
