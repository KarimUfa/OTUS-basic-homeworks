package ru.idrisov.homeworks.homework13;

public class Avto implements Participant {

    private int distance;
    private int maxDistance;
    private int toplivo;


    public Avto(int Distance) {
        this.distance = Distance;
        this.maxDistance = 100000;
        this.toplivo = this.distance / 10;
    }

    @Override
    public boolean run(String name, String currentTransport) {

        if (maxDistance < distance) {
            System.out.println("Указано слишком больше растояние. Машина может проехать максимум " + maxDistance + " метров");
            return false;
        }
        Terrain currentLocation = Terrain.PLAIN;

        System.out.println(name + " на машине проехал дистанцию " + this.distance + " метров по " + currentLocation.getIndex() + " потратив " + toplivo + " литров");

        return true;
    }


}
