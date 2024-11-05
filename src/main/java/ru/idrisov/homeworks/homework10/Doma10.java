package ru.idrisov.homeworks.homework10;

public class Doma10 {
   

    public static void main(String[] args) {
        User user = new User("Idrisovv","Karimv","Timyrovich", 1993, "Karimm19@mail.ru");
        user.info();

        User[] add = new User[10];
        for (int i=0; i <  10; i++) {
            add[i] = new User("Idrisov" + i, "Karim" + i, "Timyrovich" + i, 1980 + i, "Karimm19@mail.ru");
        }

        for(int b = 0; b < add.length; b++){
            if ((2023 - add[b].getAges()) > 40) {
                user.setUsers(add[b].getFirstName(),add[b].getUserName(),add[b].getSurName(),add[b].getAges());
                user.info();
            }
        }


        Box box = new Box(50,"black", false, "" );
        box.BoxClose();
        box.items();
        box.infoBox();



    }
}
