package com.javarush.task.task03.task0307;

/* 
Привет Starcraft!
*/

public class Solution {
    public static void main(String[] args) {
        Zerg[] zerg = new Zerg[10];
        Protoss[] protoss = new Protoss[5];
        Terran[] terran = new Terran[12];

        for(int i = 0; i < 12; i++) {
            if (i < zerg.length){
                zerg[i] = new Zerg();
                zerg[i].name = "Zerg_" + i;
            }

            if (i < protoss.length) {
                protoss[i] = new Protoss();
                protoss[i].name = "Protoss_" + i;
            }

            if (i < terran.length) {
                terran[i] = new Terran();
                terran[i].name = "Terran_" + i;
            }
        }
        //напишите тут ваш код
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
