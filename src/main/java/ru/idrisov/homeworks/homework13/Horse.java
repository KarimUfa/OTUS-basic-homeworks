package ru.idrisov.homeworks.homework13;

public class Horse implements Participant {

    private int distance;
    private int maxDistance;
    private int sila;


    public Horse(int distance) {
        this.distance = distance;
        this.maxDistance = 15000;
        this.sila = this.distance / 10;

    }

    @Override
    public boolean run(String name, String currentTransport) {

        if (maxDistance < distance) {
            System.out.println("Указано слишком больше растояние. Лошадь может пробежать максимум " + maxDistance + " метров");
            return false;
        }
        Terrain currentLocation = Terrain.PLAIN;
        System.out.println(name + " на лошаде пробежал дистанцию " + this.distance + " метров по " + currentLocation.getIndex() + " потратив " + sila + " силы");

        return true;
    }


}
