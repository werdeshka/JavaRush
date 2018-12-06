package com.javarush.task.task14.task1419;

import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int a = Integer.parseInt("puk");
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            String s = null;
            s.equals("");
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            String[] s = new String[0];
            s[3] = "10";
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new ArrayStoreException ("Oj");
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new IllegalArgumentException  ("неверный аргумент при вызове метода");
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new IllegalMonitorStateException ("неверная операция мониторинга");
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new IllegalStateException ("некорректное состояние приложения");
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new IllegalThreadStateException  ("запрашиваемая операция несовместима с текущим потоком");
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            String[] s = new String[-10];
        } catch (Exception e) {
            exceptions.add(e);
        }


        //напишите тут ваш код

    }
}
