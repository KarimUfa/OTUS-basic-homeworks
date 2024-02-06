package ru.idrisov.homeworks.homework16;


import java.util.HashMap;
import java.util.Map;


public class PhoneBook {

    public void add(String fio, String phone) {
        System.out.println("ФИО: " + fio + " Телефон: " + phone);
    }

    public Map<String, String> find(String fio) {
        Map<String, String> book = new HashMap<>();
        book.put("2222222", "fio");
        book.put("33333333", "fio2");
        book.put("111111111", "fio");
        for (var entry : book.entrySet()) {
            if (entry.getValue().equals(fio)) {
                System.out.println("Поиск по имени " + fio + " определил принадлежность номер телефона " + entry.getKey());
            }
        }
        return book;
    }

    public Map<String, String> containsPhoneNumber(String fio) {
        Map<String, String> book = new HashMap<>();
        book.put("fio", "2121122");
        book.put("fio2", "232232323");
        book.put("fio3", "232232323");
        for (var entry : book.entrySet()) {
            if (entry.getValue().equals(fio)) {
                System.out.println("Поиск по телефону " + fio + " данный номер принадлежит " + entry.getKey());
            }
        }
        return book;
    }


}
