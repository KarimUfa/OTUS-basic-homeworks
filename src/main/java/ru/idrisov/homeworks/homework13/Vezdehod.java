package ru.idrisov.homeworks.homework13;

public class Vezdehod implements Participant {
    private int Distance;
    private int MaxDistance;
    private int toplivo;


    public Vezdehod(int Distance) {
        this.Distance = Distance;
        this.MaxDistance = 900000;
        this.toplivo = this.Distance / 15;
    }

    @Override
    public boolean run(String name, String currentTransport) {

        if (MaxDistance < Distance) {
            System.out.println("Указано слишком больше растояние. Вездеход может проехать максимум " + MaxDistance + " метров");
            return false;
        }
        Terrain currentLocation = Terrain.BOLOTO;

        System.out.println(name + " на машине проехал дистанцию " + this.Distance + " метров по " + currentLocation.getIndex() + " потратив " + toplivo + " литров");

        return true;
    }
}
