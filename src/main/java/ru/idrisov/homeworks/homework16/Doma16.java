package ru.idrisov.homeworks.homework16;

public class Doma16 {

    public static void main(String[] args) {
        PhoneBook book = info();
        System.out.println("Метод find:" + book.find("fio"));
        System.out.println("Метод containsPhoneNumber :" + book.containsPhoneNumber("232232323"));
    }

    private static PhoneBook info() {
        PhoneBook book = new PhoneBook();
        book.add("fio", "121212121212");
        book.add("fio2", "12112");
        return book;
    }


}
