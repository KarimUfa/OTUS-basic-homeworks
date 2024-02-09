package ru.idrisov.homeworks.homework16;


import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    private HashMap<String, String> book;

    public PhoneBook() {
        this.book = new HashMap<>();
    }

    public void add(String fio, String phone) {
        book.put(fio, phone);
    }

    public String find(String fio) {
        String phoneNumber = book.get(fio);
        if (phoneNumber == null) return "Номер не найден";
        return phoneNumber;
    }

    public String containsPhoneNumber(String number) {
        String phoneNumber = "Информация не найдена";
        for (Map.Entry<String, String> item : book.entrySet()) {
            if (item.getValue().equals(number)) {
                phoneNumber = "Номер телефона " + number + " найден. Принадлежит " + item.getKey();
            }
        }
        return phoneNumber;
    }

}
