package ru.idrisov.homeworks.homework19;

import java.io.*;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Doma19 {

    public static void main(String[] args) throws IOException {
        Path currentRelativePath = Paths.get("");
        String s = currentRelativePath.toAbsolutePath().toString();
        Main main = new Main(new File(s + "\\src\\test\\java\\"));
        main.methodTwo();
    }
}

