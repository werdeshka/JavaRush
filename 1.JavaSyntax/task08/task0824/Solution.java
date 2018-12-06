package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> list1 = new ArrayList<>();
        Human son = new Human("Иван", true, 4, list1);
        Human douther1 = new Human("Софья", false, 1, list1);
        Human douther2 = new Human("Алиса", false, 1, list1);

        ArrayList<Human> list2 = new ArrayList<>();
        Collections.addAll(list2, son, douther1, douther2);
        Human dad = new Human("Сергей1", true, 30, list2);
        Human mum = new Human("Екатерина", false, 28, list2);

        list2 = new ArrayList<>();
        list2.add(dad);
        Human grandpa1 = new Human("Сергей", true, 54, list2);
        Human grandma1 = new Human("Анна", false, 55, list2);

        list2 = new ArrayList<>();
        list2.add(mum);
        Human grandpa2 = new Human("Василий", true, 64, list2);
        Human grandma2 = new Human("Полина", false, 65, list2);

        System.out.println(son.toString());
        System.out.println(douther1.toString());
        System.out.println(douther2.toString());
        System.out.println(grandpa1.toString());
        System.out.println(grandma1.toString());
        System.out.println(grandpa2.toString());
        System.out.println(grandma2.toString());
        System.out.println(dad.toString());
        System.out.println(mum.toString());

        //напишите тут ваш код
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }
        //напишите тут ваш код

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}