package com.javarush.task.task06.task0614;

import java.util.ArrayList;

/* 
Статические коты
*/

public class Cat {
    public static ArrayList<Cat> cats = new ArrayList();
    //напишите тут ваш код

    public Cat() {

    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Cat cat = new Cat();
            cats.add(cat);
        }
        //напишите тут ваш код
        printCats();
    }

    public static void printCats() {
        /*String catss = "";
        for (int i = 0; i < Cat.cats.size(); i++) {
            catss += Cat.cats.get(i) + "\n";
        }
        System.out.println(catss);*/
        cats.forEach(System.out::println);
        //напишите тут ваш код
    }
}
