package ru.idrisov.homeworks.homework15;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Doma15 {

    public static void main(String[] args) {

        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(4, 6, 9, 10, 7, 9));
        ArrayList<Employee> employee = new ArrayList<>();
        employee.add(new Employee("Vadim", 8));
        employee.add(new Employee("Igor", 25));
        employee.add(new Employee("Sergei", 10));
        employee.add(new Employee("Stas", 5));


        System.out.println(zadacha1(1, 7));
        System.out.println(zadacha2(arrList));
        zadacha3(arrList.get(0), arrList);
        zadacha4(arrList.get(0), arrList);
        System.out.println(zadacha6(employee));
        System.out.println(zadacha7(employee, employee.get(0).getAge()));
        System.out.println(zadacha8(employee, employee.get(0).getAge()));
        System.out.println(zadacha9(employee));

    }


    //Задача 1
    public static List<Integer> zadacha1(int min, int max) {
        List<Integer> arrayList = new ArrayList<>();
        for (int a = min; a <= max; a++) {
            arrayList.add(a);
        }
        return arrayList;
    }

    // Задание 2. Реализуйте метод, принимающий в качестве аргумента список целых чисел, суммирующий все элементы, значение которых больше 5, и возвращающий сумму;
    public static int zadacha2(ArrayList<Integer> arrList) {
        int summa = 0;
        for (int a = 0; a < arrList.size(); a++) {
            if (arrList.get(a) > 5) {
                summa += arrList.get(a);
            }
        }
        return summa;
    }


    // Задание 3. Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на список, метод должен переписать каждую заполненную ячейку списка указанным числом;
    public static void zadacha3(int sum, ArrayList<Integer> arrList) {

        for (int a = 0; a < arrList.size(); a++) {
            arrList.set(a, sum);
        }
        System.out.println(arrList);
    }

    // Задание 4. Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на список, увеличивающий каждый элемент списка на указанное число;
    public static void zadacha4(int sum, ArrayList<Integer> arrList) {

        for (int a = 0; a < arrList.size(); a++) {
            arrList.set(a, arrList.get(a) + sum);
        }
        System.out.println(arrList);
    }

    // Задача 6
    public static ArrayList<String> zadacha6(ArrayList<Employee> employee) {

        ArrayList<String> names = new ArrayList<>();
        for (int a = 0; a < employee.size(); a++) {
            names.add(employee.get(a).getName());
        }
        return names;
    }

    //Задача 7
    public static ArrayList<String> zadacha7(ArrayList<Employee> employee, int ages) {

        ArrayList<String> names = new ArrayList<>();
        names.add("С минимальным возрастом: " + employee.get(0).getName());

        for (int a = 0; a < employee.size(); a++) {
            if (employee.get(a).getAge() >= ages) {
                names.add(employee.get(a).getName());
            }
        }
        return names;
    }

    //Задача 8
    public static ArrayList<String> zadacha8(ArrayList<Employee> employee, int ages) {

        ArrayList<String> names = new ArrayList<>();
        for (int a = 0; a < employee.size(); a++) {
            if (employee.get(a).getAge() / 2 >= ages) {
                names.add("С минимальным средним возрастом: " + employee.get(a).getName());
            }
        }
        return names;
    }

    //Задача 9
    public static ArrayList<String> zadacha9(ArrayList<Employee> employee) {

        int ages = employee.get(0).getAge();
        ArrayList<String> names = new ArrayList<>();
        for (int a = 0; a < employee.size(); a++) {
            if (employee.get(a).getAge() < ages) {
                names.add("Самый молодой сотрудник: " + employee.get(a).getName());
            }
        }
        return names;
    }
}


