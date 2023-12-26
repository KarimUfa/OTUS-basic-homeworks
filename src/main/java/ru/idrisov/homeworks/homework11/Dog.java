package ru.idrisov.homeworks.homework11;

public class Dog extends Animal{


    public Dog(String name, int speedRun, int speedsSwim, int endurance) {
        super(name,speedRun,speedsSwim,endurance);
    }

    @Override
    public void swim(int distance){
        this.endurance =  endurance - distance * 2;
        float time =  (float) distance/speedsSwim;
        if (this.endurance < 1){
            System.out.println("-1 , у животного " + name + " появилась усталось.");
            return;
        }
        System.out.println(name + " дистанцию на " + distance + " метров, проплыл за " +  String.valueOf(time).substring(0,3) + " секунд. Оставшиеся выносливость = " + this.endurance + ".");

    }

}
