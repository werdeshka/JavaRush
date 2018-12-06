package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human grandpa1 = new Human("Сергей", true, 54);
        Human grandma1 = new Human("Анна", false, 55);
        Human grandpa2 = new Human("Василий", true, 64);
        Human grandma2 = new Human("Полина", false, 65);
        Human dad = new Human("Сергей1", true, 30, grandpa1, grandma1);
        Human mum = new Human("Екатерина", false, 28, grandpa2, grandma2);
        Human son = new Human("Иван", true, 4, dad, mum);
        Human douther1 = new Human("Софья", false, 1, dad, mum);
        Human douther2 = new Human("Алиса", false, 1, dad, mum);

        System.out.println(grandpa1.toString());
        System.out.println(grandma1.toString());
        System.out.println(grandpa2.toString());
        System.out.println(grandma2.toString());
        System.out.println(dad.toString());
        System.out.println(mum.toString());
        System.out.println(son.toString());
        System.out.println(douther1.toString());
        System.out.println(douther2.toString());
        //напишите тут ваш код
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father, mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }
        //напишите тут ваш код

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















