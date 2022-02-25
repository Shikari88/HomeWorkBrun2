package HWLesson3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Задача 1. Проверка через ввод чисел в консоль
        Arithmetic arithmetic = new Arithmetic();
        arithmetic.numX(0);
        System.out.println(arithmetic.x);
        arithmetic.numY(4);
        System.out.println(arithmetic.y);

//        arithmetic.x = scanner.nextInt();
//        arithmetic.numX();
//        arithmetic.y = scanner.nextInt();
//        arithmetic.numY();

        //Задача 2.
        Employee employee = new Employee();
        employee.age = 30;
        employee.name = "John";
        employee.surname = "Doe";
        employee.patronymic = "Winston";
        employee.salary = 10;
        employee.email = "john1666@bk.com";
        employee.phone = 443298;
        employee.position = "Jun";

        Employee employee1 = new Employee();
        employee1.age = 50;
        employee1.name = "Jane";
        employee1.surname = "Doe";
        employee1.patronymic = "Marlboro";
        employee1.salary = 8;
        employee1.email = "jane1646@bk.com";
        employee1.phone = 443297;
        employee1.position = "Mid";

        Employee employee2 = new Employee();
        employee2.age = 60;
        employee2.name = "Jonny";
        employee2.surname = "Doe";
        employee2.patronymic = "Uncle Ben's";
        employee2.salary = 90;
        employee2.email = "jonny1636@bk.com";
        employee2.phone = 493298;
        employee2.position = "Sen";

        Employee[] emplArrays;
        emplArrays = new Employee[3];
        emplArrays[0] = employee;
        emplArrays[1] = employee1;
        emplArrays[2] = employee2;

        for (int i = 0; i < emplArrays.length; i++) {
            if(emplArrays[i].age > 40) {
                emplArrays[i].showInfo();
            }
        }
    }
}
