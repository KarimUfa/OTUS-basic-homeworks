package ru.idrisov.homeworks.homework12;

import ru.idrisov.homeworks.homework11.Cat;

public class Doma12 {
    public static void main(String[] args) {

        Tarelka tarelka = new Tarelka(100, 90);
        tarelka.add(10);
        tarelka.DecreaseFood(70);
        tarelka.info();

        Cats[] cats = {new Cats("Barsik", 10),
                new Cats("Tomas", 15),
                new Cats("Fedor", 35)};
        for (int i = 0; i < cats.length; i++) {
            if (cats[i].isSatiety() == true && cats[i].getAppetite() <= tarelka.getCurrentEat()) {
                cats[i].eating(tarelka);
                System.out.println("Котик по имени " + cats[i].getName() + " покушал " + tarelka.getCurrentEat());
            } else {
                System.out.println("Кот" + cats[i].getName() + " оказался без пайка!");
            }
        }

    }}