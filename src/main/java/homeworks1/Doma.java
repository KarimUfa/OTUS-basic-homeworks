package homeworks1;


import java.util.Scanner;


public class  Doma {

    public static void main (String[] args)
    {

        greetings();
        checkSign(1, 2, 3);
        selectColor();
        compareNumbers();
        addOrSubtractAndPrint(5,10,false);
        scannerRand();

    }
    //Задание №1
    public static void greetings (){
        System.out.print("Hello\nWorld\nfrom\nJava\n");
    }

    //Задание №2 -передаем данные в  public static void main
    public static void checkSign(int a, int b, int c){
        int summ = a + b + c;
        if (summ >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }


    //Задание №3 -передаем данные в  public static void main
    public static void selectColor(){
        int data = 15;
        if(data <= 10 ){
            System.out.println("Красный");
        } else if (data >= 10 && data <= 20){
            System.out.println("Желтый");
        } else if (data > 20){
            System.out.println("Зеленый");
        } else {}

    }

    //Задание №4 -передаем данные в  public static void main
    public static void compareNumbers(){
        int a = 5;
        int b = 10;
        if (a >= b){
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    //Задание №5 -передаем данные в  public static void main
    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment){
        if (increment == true){
            int summ = initValue + delta;
            System.out.println(summ);
        } else {
            int summ = initValue - delta;
            System.out.println(summ);
        }
    }

    //Задание №6 -со звездочкой
    public static void scannerRand(){

        while(true){
            System.out.println("Введите число от 1-5:");
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            int y = (int)(Math.random()*10);

            System.out.println(y);
            if (x > 5){
                System.out.println("Произошла ошибка.");
                break;
            }


        }
    }




}

