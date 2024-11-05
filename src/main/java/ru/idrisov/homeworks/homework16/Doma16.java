package ru.idrisov.homeworks.homework16;

public class Doma16 {

    public static void main(String[] args) {
        PhoneBook book = info();
        System.out.println("Метод find: " + book.find("fio"));
        System.out.println("Метод containsPhoneNumber: " + book.containsPhoneNumber("22222222wwww"));
    }

    private static PhoneBook info() {
        PhoneBook book = new PhoneBook();
        book.add("fio", "1111111");
        book.add("fio", "222222233333");
        book.add("fio2", "2222222");
        book.add("fio3", "55555555555");
        return book;
    }


}
