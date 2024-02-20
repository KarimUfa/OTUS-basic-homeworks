package ru.idrisov.homeworks.homework13;

public class Vezdehod implements Participant {
    private int distance;
    private int maxDistance;
    private int toplivo;


    public Vezdehod(int distance) {
        this.distance = distance;
        this.maxDistance = 900000;
        this.toplivo = this.distance / 15;
    }

    @Override
    public boolean run(String name, String currentTransport) {

        if (maxDistance < distance) {
            System.out.println("Указано слишком больше растояние. Вездеход может проехать максимум " + maxDistance + " метров");
            return false;
        }
        Terrain currentLocation = Terrain.SWAMP;

        System.out.println(name + " на машине проехал дистанцию " + this.distance + " метров по " + currentLocation.getIndex() + " потратив " + toplivo + " литров");

        return true;
    }
}
