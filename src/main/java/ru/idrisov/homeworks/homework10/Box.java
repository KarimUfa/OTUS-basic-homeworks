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
        if (isClosed == true){
            System.out.println("Коробка закрыта");
            System.out.println("=========");
            return;
        }
        System.out.println("Коробка открыта");
        System.out.println("=========");
    }


    public void items(){
        if (isClosed == true){
            System.out.println("Коробка закрыта, не получится положить предмет");
            System.out.println("=========");
            return;
        }

        if (!items.equals("")) {
            System.out.println("В коробке лежало " + items + ", но уже выкинули");
            this.items = "";
            return;
        }

       String item = "Шарик";
        this.items = item;
        System.out.println("Коробка была пустой, поэтому мы положили в нее " + item);
    }




    public void infoBox() {
        System.out.println("Размер коробки: " + size);
        System.out.println("Цвет коробки: " + color);

        if (isClosed) {   System.out.println("Статус коробки:  открыт");
        } else {  System.out.println("Статус коробки:  закрыт"); }

        if (!items.equals("")) {   System.out.println("Наличие предмета в коробке: " + items);
        } else {  System.out.println("Наличие предмета в коробке: пусто"); }
    }

    }
