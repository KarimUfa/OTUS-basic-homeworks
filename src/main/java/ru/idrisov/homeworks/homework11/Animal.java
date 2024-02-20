package ru.idrisov.homeworks.homework11;

public class Animal {
    protected String name;
    protected int speedRun;
    protected int speedsSwim;
    protected int endurance;


    public Animal(String name, int speedRun, int speedsSwim, int endurance) {
        this.name = name;
        this.speedRun = speedRun;
        this.speedsSwim = speedsSwim;
        this.endurance = endurance;
    }


    public void info() {
        System.out.println("Имя: " + name);
        System.out.println("Скорость бега в м/с: " + speedRun);
        System.out.println("Скорость плавания в м/с: " + speedsSwim);
        System.out.println("Выносливость: " + endurance);

    }

    public void run(int distance){
        this.endurance =  endurance - distance;
        float time =  (float) distance/speedRun;
        System.out.println(name + " дистанцию на " + distance + " метров, пробежит за " +  String.valueOf(time).substring(0,3) + " секунд. Оставшиеся выносливость = " + this.endurance + ".");
    }

    public void swim(int distance){

        float time =  (float) distance/speedsSwim;

        if (this.endurance < 1){
            System.out.println("-1 , у животного " + name + " появилась усталось.");
            return;
        }
        System.out.println(name + " дистанцию на " + distance + " метров, проплыл за " +  String.valueOf(time).substring(0,3) + " секунд. Оставшиеся выносливость = " + this.endurance + ".");
    }



}
