package HWLesson1;

import java.util.Scanner;

public class Hw1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
//        if (s != null) {
//            System.out.println("Я сплю");
//        }
        if (!s.isEmpty()) {
            System.out.println("Я сплю");
        } else {
            //строку вывел для наглядности
            System.out.println("Как хорошо что вы молчите");
        }
    }
}
