package ru.idrisov.homeworks.homework13;

public class Human {

    private String name;
    private String currentTransport;


    public Human(String name) {
        this.name = name;
        this.currentTransport = "Машина";
    }

    public void trans(String tranpsport) {
        if (currentTransport == "") {
            System.out.println(name + " на данный момент не использует никакой транспорт");
            return;
        }
        if (currentTransport != tranpsport && tranpsport != "") {
            System.out.println(name + " на текущий момент использует " + currentTransport);
            return;
        }
        if (tranpsport != "" && tranpsport != null) {
            this.currentTransport = tranpsport;
            System.out.println(name + " сел на " + tranpsport);
            return;
        }
    }

    public boolean doIt(Participant participant) {
        if(currentTransport != "") {
            return participant.run(name, currentTransport);
        } else {
            System.out.println(name + " не использует транпорт");
            return false;
        }
    }

}