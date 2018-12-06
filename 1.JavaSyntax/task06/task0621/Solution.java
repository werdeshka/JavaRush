package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandfatherName = reader.readLine();
        Cat catGrandFather = new Cat(grandfatherName);

        String grandmotherName = reader.readLine();
        Cat catGrandMother = new Cat(grandmotherName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, null, catGrandFather);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGrandMother, null);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather);

        String childName = reader.readLine();
        Cat catChild = new Cat(childName, catMother, catFather);

        System.out.println(catGrandFather);
        System.out.println(catGrandMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catChild);
    }

    public static class Cat {
        private String name;
        private Cat mParent;
        private Cat fParent;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat mParent, Cat fParent) {
            this.name = name;
            this.mParent = mParent;
            this.fParent = fParent;
        }

        @Override

        public String toString() {
            String out = "Cat name is " + name;

            out += (mParent == null) ? ", no mother" : ", mother is " + mParent.name;
            out += (fParent == null) ? ", no father" : ", father is " + fParent.name;

            return out;
        }
    }

}
