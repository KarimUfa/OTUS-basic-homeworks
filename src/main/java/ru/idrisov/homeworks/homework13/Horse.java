package ru.idrisov.homeworks.homework13;

public class Horse implements Participant {

    private int Distance;
    private int MaxDistance;
    private int Sila;


    public Horse(int Distance) {
        this.Distance = Distance;
        this.MaxDistance = 15000;
        this.Sila = this.Distance / 10;

    }

    @Override
    public boolean run(String name, String currentTransport) {

        if (MaxDistance < Distance) {
            System.out.println("Указано слишком больше растояние. Лошадь может пробежать максимум " + MaxDistance + " метров");
            return false;
        }
        Terrain currentLocation = Terrain.RAVNINA;
        System.out.println(name + " на лошаде пробежал дистанцию " + this.Distance + " метров по " + currentLocation.getIndex() + " потратив " + Sila + " силы");

        return true;
    }


}
