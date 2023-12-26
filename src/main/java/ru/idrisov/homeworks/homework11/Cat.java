package ru.idrisov.homeworks.homework11;

public class Cat extends Animal{


    public Cat(String name, int speedRun, int speedsSwim, int endurance) {
        super(name,speedRun,speedsSwim,endurance);
    }

    @Override
    public void swim(int distance){
            System.out.println(name + " не умеет плавать.");
            return;
    }


}
