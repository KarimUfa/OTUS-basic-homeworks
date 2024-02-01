package ru.idrisov.homeworks.homework13;

public class Bike implements Participant{

    private int Distance;
    private int MaxDistance;

    public Bike(int Distance) {
        this.Distance = Distance;
        this.MaxDistance = 10000;
    }

    @Override
    public boolean run(String name, String currentTransport) {

        if (MaxDistance < Distance) {
            System.out.println("Указано слишком больше растояние. Велосипед может проехать максимум " + MaxDistance + " метров");
            return false;
        }
        Terrain currentLocation = Terrain.RAVNINA;

        System.out.println(name + " на велосипеде проехал дистанцию " + this.Distance + " метров по " + currentLocation.getIndex());

        return true;
    }


}
