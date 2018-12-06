package com.javarush.task.task06.task0605;


import java.io.*;

/* 
Контролируем массу тела
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.massIndex(weight, height);
    }

    public static class Body {
        public static void massIndex(double weight, double height) {
            double index = weight / (height * height);
            int a = ((index >= 18.5) && (index < 25)) ? 2 : (((index >= 25) && (index < 30)) ? 3 : (index >= 30) ? 4 : 1);
            switch (a){
                case 1:
                    System.out.println("Недовес: меньше чем 18.5");
                    break;
                case 2:
                    System.out.println("Нормальный: между 18.5 и 24.9");
                    break;
                case 3:
                    System.out.println("Избыточный вес: между 25 и 29.9");
                    break;
                case 4:
                    System.out.println("Ожирение: 30 или больше");
                    break;
            }


            //напишите тут ваш код
        }
    }
}
