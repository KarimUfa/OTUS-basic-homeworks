package ru.idrisov.homeworks.homework14;

import java.util.Arrays;

public class Doma14 {

    public static void main(String[] args) {

        Doma14 main = new Doma14(); // Создаем объект для даль использования в текущем классе
        String[][] corrects = {{"1", "2", "3", "4"}, {"5", "6", "й", "8"}, {"9", "5", "6", "5"}, {"5", "4", "3", "2"}};
        String[][] corrects2 = {{"1", "2", "2", "4"}, {"5", "q", "7", "8"}, {"9", "5", "2", "5"}, {"5", "4", "3", "2"}};
        try {
            main.stringExceptionTest(corrects);
            main.stringSumm(corrects2);
        } catch (AppArraySizeException e) {
            e.printStackTrace();
        } catch (AppArrayDataException ex) {
            ex.printStackTrace();
        }
    }

    public void stringExceptionTest(String[][] correct) throws AppArraySizeException {
        if (correct.length != 4) throw new AppArraySizeException("Неверное количество строк");
        for (int i = 0; i < correct.length; i++) {
            if (correct[i].length != 4) throw new AppArraySizeException("Неверное количество столбцов");
            for (int j = 0; j < correct[i].length; j++) {
                System.out.print(correct[i][j]);
            }
            System.out.println();
        }
    }

    public void stringSumm(String[][] correct) throws AppArrayDataException {
        int sum = 0;
        for (int i = 0; i < correct.length; i++) {
            for (int j = 0; j < correct[i].length; j++) {
                if (isNumeric(correct[i][j]) == false)
                    throw new AppArrayDataException("В ячейке " + Arrays.asList(correct[j]) + " лежат неверные данные");
                sum += Integer.parseInt(correct[i][j]);
                System.out.println(sum);
            }
        }
        System.out.println("Сумма сложения чисел равна " + sum);
    }

    public static boolean isNumeric(String error) {
        try {
            Integer.parseInt(error);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}


