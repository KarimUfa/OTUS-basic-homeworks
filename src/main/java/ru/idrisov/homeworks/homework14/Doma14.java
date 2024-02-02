package ru.idrisov.homeworks.homework14;

public class Doma14 {

    public static void main(String[] args) {

        Doma14 main = new Doma14(); // Создаем объект для даль использования в текущем классе
        String[][] corrects = { {"1", "2", "3", "4"},{"5", "6", "7","8"}, {"9", "5", "6","5"}, {"5", "4", "3", "2"}};
        String[][] correc = { {"1", "2", "2", "4"},{"5", "й", "7","8"}, {"9", "5", "6","5"}, {"5", "4", "3", "2"}};
        try {
            main.stringExceptionTest(corrects); //в main обращаемся к объекту передавая данные из массива
            main.stringSumm(correc);
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
               sum += Integer.parseInt(correct[i][j]);
                System.out.println(sum);
            }
        }
       System.out.println("Сумма сложения чисел равна " + sum);
    }
}


