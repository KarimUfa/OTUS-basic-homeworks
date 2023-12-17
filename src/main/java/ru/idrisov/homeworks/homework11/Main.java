package ru.idrisov.homeworks.homework11;


public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 7, 0, 30);
        Dog dog = new Dog("Sharik", 9, 6, 40);
        Horse horse = new Horse("Horse", 15, 5, 50);
//
        cat.info();
        cat.run(10);
        dog.info();
        dog.run(10);
        dog.swim(12);
        horse.info();
        horse.run(10);
        horse.swim(12);

    }
}
