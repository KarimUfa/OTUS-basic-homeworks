package ru.idrisov.homeworks.homework19;


import ru.idrisov.homeworks.homework14.AppArraySizeException;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Doma19 {

    public static void main(String[] args) throws IOException {
        Path currentRelativePath = Paths.get("");
        String s = currentRelativePath.toAbsolutePath().toString();

        File file = new File(s + "\\src\\test\\java\\");

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
                    System.out.println(result);
                    break;
                }
            }

            if (result.isEmpty()) {
                System.out.println("К сожалению вводимое вами название файла " + files + " не найдено");
                return;
            }

            try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(s + "\\src\\test\\java\\" + files))) {
                int n = in.read();
                while (n != -1) {
                    System.out.print((char) n);
                    n = in.read();
                }
                Scanner sc = new Scanner(System.in);
                System.out.println("\nНапишите любой текст для изменения содержимого в текущем файле: ");
                String text = sc.nextLine();

                if (text.isEmpty()) {
                    System.out.println("Введите текст");
                    return;
                }

                try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(s + "\\src\\test\\java\\" + files))) {
                    byte[] buffer = text.getBytes(StandardCharsets.UTF_8);
                    System.out.println("Вы успешно изменили содержимое файла " + files + " на " + text);
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
