package HWLesson1;

import java.util.Scanner;

public class MaxMinNum {
    public static void main(String[] args) {
        //Наибольшее и наименьшее число из трех введенных в консоль

        // Это первое что пришло в голову, но я уверен есть решение по-компактнее.
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a < b & a < c & b < c) {
            System.out.println("Max" + c + "Min" + a);
        } else if (b < a & b > c & a > c) {
            System.out.println("Max" + a + "Min" + c);
        } else if (b < a & b < c & a > c) {
            System.out.println("Max" + a + "Min" + b);
        } else if (b < a & b < c & a < c) {
            System.out.println("Max" + c + "Min" + b);
        } else if (b > a & b > c & a < c) {
            System.out.println("Max" + b + "Min" + a);
        } else {
            System.out.println("Max" + b + "Min" + c);
        }
    }
}
