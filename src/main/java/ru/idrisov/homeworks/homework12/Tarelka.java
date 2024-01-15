package ru.idrisov.homeworks.homework12;

public class Tarelka {
    private int maxfood;
    private int food;

    public int getCurrentEat() {
        return food;
    }

    public Tarelka(int maxfood, int food) {
        this.maxfood = maxfood;
        this.food = food;
    }


    public void add(int count) {
        if (count == 0) {
            System.out.println("Укажие значение");
            return;
        }

        if (maxfood == food) {
            System.out.println("В добавлении еды необходимости нет");
            return;
        }

        if (food + count > maxfood) {
            int countMaxFood = maxfood - food;
            System.out.println("Вы пытались добавить " + count + " еды, к " + food + " но значение оказалось слишком большим, я сумел добавить лишь " + countMaxFood);
            food = food + countMaxFood;
            return;
        }

        System.out.println("Вы успешно добавили " + count + " еды, к текущему " + food);
        food = food + count;
    }

    public boolean DecreaseFood(int eats) {
        if (eats < 1) {
            System.out.println("Значение eats не может быть отрицательным числом");
            return false;
        }
        int finalEat = food - eats;
        if (finalEat >= 0 && eats > 0) {
            food = finalEat;
            System.out.println("В тарелке осталось " + finalEat + " еды");
        }

        if (finalEat < 0) {
            food = 0;
            System.out.println("В тарелке осталось " + food + " еды");
            System.out.println("Тарелка пустая! " + food + " еды");
        }
        return true;
    }

    public void info() {
        System.out.println("Макс. кол-во еды " + maxfood);
        System.out.println("Текущее кл-во еды " + food);
    }


}
