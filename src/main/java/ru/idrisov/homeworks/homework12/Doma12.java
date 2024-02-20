package ru.idrisov.homeworks.homework12;

import ru.idrisov.homeworks.homework11.Cat;

public class Doma12 {
    public static void main(String[] args) {

        Tarelka tarelka = new Tarelka(100, 90);
        tarelka.add(10);
        tarelka.DecreaseFood(70);
        tarelka.info();

        Cats[] cat = {new Cats("Barsik", 10),
                new Cats("Tomas", 15),
                new Cats("Fedor", 35)};
        for (int i = 0; i < cat.length; i++) {
            if (cat[i].isSatiety() == true && cat[i].getAppetite() <= tarelka.getCurrentEat()) {
                cat[i].eating(tarelka);
                System.out.println("Котик по имени " + cat[i].getName() + " покушал " + tarelka.getCurrentEat());
            } else {
                System.out.println("Кот" + cat[i].getName() + " оказался без пайка!");
            }
        }

    }}