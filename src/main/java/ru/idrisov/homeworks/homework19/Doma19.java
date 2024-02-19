package ru.idrisov.homeworks.homework19;


import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.io.IOException;


public class Doma19 {

    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\User\\Desktop\\OTUS-basic-homeworks\\src\\test\\java\\");

        if (file.exists()) {

            File[] arr = file.listFiles();
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i].getName());
            }

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите имя файла из списка выше для продолжения работы: ");
            String files = scanner.nextLine();

            String result = "";
            for (int i = 0; i < arr.length; i++) {
                if (files.equals(arr[i].getName())) {
                    result = "Отлично! Файл под названием " + files + " найден!\nСодержимое файла: ";
                    break;
                }
            }

            if (result.isEmpty()) {
                System.out.println("К сожалению вводимое вами название файла " + files + " не найдено");
                return;
            }

            System.out.println(result);
            try (BufferedInputStream in = new BufferedInputStream(new FileInputStream("C:\\Users\\User\\Desktop\\OTUS-basic-homeworks\\src\\test\\java\\" + files))) {
                int n = in.read();
                while (n != -1) {
                    System.out.print((char) n);
                    n = in.read();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            Scanner sc = new Scanner(System.in);
            System.out.println("\nНапишите любой текст для изменения содержимого в текущем файле: ");
            String text = sc.nextLine();

            if (text.isEmpty()) {
                System.out.println("Введите текст");
                return;
            }

            System.out.println("Вы успешно изменили содержимое файла " + files + " на " + text);
            try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("C:\\Users\\User\\Desktop\\OTUS-basic-homeworks\\src\\test\\java\\" + files))) {
                byte[] buffer = text.getBytes(StandardCharsets.UTF_8);
                out.write(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }


        }


    }

}
