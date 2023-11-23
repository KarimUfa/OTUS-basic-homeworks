package ru.idrisov.homeworks.homework10;

public class Box {

    private int size;
   private String color;
    private boolean isClosed;
    private String items;

    public Box( int size,String color,boolean isClosed,String items){
            this.size = size;
            this.color = color;
            this.items = items;
           this.isClosed = isClosed;
    }

    public void BoxClose(){
        if (isClosed == false){
            System.out.println("Коробка закрыта");
            System.out.println("=========");
            return;
        }
        System.out.println("Коробка открыта");
        System.out.println("=========");
        return;
    }


    public void items(){
        if (isClosed == false){
            System.out.println("Коробка закрыта");
            System.out.println("=========");
            return;
        }
        if (items != "") {
            System.out.println("В коробке что-то лежит");
            System.out.println("=========");
            this.items = "";
            System.out.println("Предмет с коробки удален");
            System.out.println("=========");
        }
        System.out.println("Коробка пустая");
        System.out.println("=========");
        return;
        }



    public void infoBox() {
        System.out.println("Размер коробки: " + size);
        System.out.println("Цвет коробки: " + color);

        if (isClosed) {   System.out.println("Статус коробки:  открыт");
        } else {  System.out.println("Статус коробки:  закрыт"); }

        if (items != "") {   System.out.println("Наличие предмета в коробке: " + items);
        } else {  System.out.println("Наличие предмета в коробке: пусто"); }
    }

    }
