package ru.idrisov.homeworks.homework13;

public class Bike implements Participant{

    private int distance;
    private int maxDistance;

    public Bike(int distance) {
        this.distance = distance;
        this.maxDistance = 10000;
    }

    @Override
    public boolean run(String name, String currentTransport) {

        if (maxDistance < distance) {
            System.out.println("Указано слишком больше растояние. Велосипед может проехать максимум " + maxDistance + " метров");
            return false;
        }
        Terrain currentLocation = Terrain.PLAIN;

        System.out.println(name + " на велосипеде проехал дистанцию " + this.distance + " метров по " + currentLocation.getIndex());

        return true;
    }


}
