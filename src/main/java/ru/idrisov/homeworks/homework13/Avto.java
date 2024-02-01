package ru.idrisov.homeworks.homework13;

public class Avto implements Participant {

    private int Distance;
    private int MaxDistance;
    private int toplivo;


    public Avto(int Distance) {
        this.Distance = Distance;
        this.MaxDistance = 100000;
        this.toplivo = this.Distance / 10;
    }

    @Override
    public boolean run(String name, String currentTransport) {

        if (MaxDistance < Distance) {
            System.out.println("Указано слишком больше растояние. Машина может проехать максимум " + MaxDistance + " метров");
            return false;
        }
        Terrain currentLocation = Terrain.RAVNINA;

        System.out.println(name + " на машине проехал дистанцию " + this.Distance + " метров по " + currentLocation.getIndex() + " потратив " + toplivo + " литров");

        return true;
    }


}
