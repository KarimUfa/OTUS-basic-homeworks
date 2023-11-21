package ru.idrisov.homeworks.homework10;

public class Box {

    private int size;
   private String color;
    private boolean isClosed;
    private String items;

    public Box( int size,String color,boolean isClosed,String items){
         if (!isClosed){
            System.out.println("Коробка закрыта");
            return;
        }
            this.size = size;
            this.color = color;
            this.items = items;

    }

    public void infoBox() {
        System.out.println("Размер коробки: " + size);
        System.out.println("Цвет коробки: " + color);

        if (isClosed) {   System.out.println("Статус коробки:  открыт");
        } else {  System.out.println("Статус коробки:  закрыт"); }

        System.out.println("Наличие предмета в коробке: " + items);
    }

    }
