package ru.idrisov.homeworks.homework13;


public class Doma13 {
    public static void main(String[] args) {
 Human human = new Human ("Коля");
 human.trans("Вездеход");

        Participant [] participants = {
                new Avto (10000),
                new Horse (8000),
                new Bike (3000),
                new Vezdehod (5000)

        };

        for (Participant o : participants){
            human.doIt(o);
        }

    }
}
