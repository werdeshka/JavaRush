package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen {

    @Override
    int getCountOfEggsPerMonth() {
        return 5;
    }

    @Override
    String getDescription() {
        return super.getDescription() + String.format(" Моя страна - %s. Я несу %s яиц в месяц.", Country.UKRAINE, getCountOfEggsPerMonth());
    }
}