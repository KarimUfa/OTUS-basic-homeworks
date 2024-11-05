package ru.idrisov.homeworks.homework19;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    private File files;

    public Main(File file) {
        this.files = file;
    }

    public int txt(File file) {
        File[] arr = file.listFiles();
        System.out.println("Найдены следующие файлы в категории: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getName());
        }
        return arr.length;
    }

    public String scannerOne() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя файла из списка выше для продолжения работы: ");
        String files = scanner.nextLine();
        return files;
    }

    public String scannerTwo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nНапишите любой текст для изменения содержимого в текущем файле: ");
        String text = sc.nextLine();
        return text;
    }

    public boolean methodBoolean(File file, String scanner) {
        File[] arr = file.listFiles();

        boolean search = false;
        for (int i = 0; i < arr.length; i++) {
            if (scanner.equals(arr[i].getName())) {
                search = true;
                break;
            }
        }

        if (search) {
            System.out.println("Отлично! Файл под названием " + scanner + " найден!\nСодержимое файла: ");
        } else {
            System.out.println("К сожалению вводимое вами название файла " + scanner + " не найдено");
        }

        return search;
    }

    public void methodTwo() {
        if (files.exists()) {

            txt(files);
            String scanner = scannerOne();

            if (!methodBoolean(files, scanner)) {
                return;
            }

            try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(files + "\\" + scanner))) {
                int n = in.read();
                while (n != -1) {
                    System.out.print((char) n);
                    n = in.read();
                }
                String scannerTwo = scannerTwo();

                if (scannerTwo.isEmpty()) {
                    System.out.println("Введите текст");
                    return;
                }

                try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(files + "\\" + scanner))) {
                    byte[] buffer = scannerTwo.getBytes(StandardCharsets.UTF_8);
                    System.out.println("Вы успешно изменили содержимое файла " + scanner + " на " + scannerTwo);
                    out.write(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

}
