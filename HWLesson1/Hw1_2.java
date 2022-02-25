package HWLesson1;

import java.util.Scanner;

public class Hw1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        //System.out.println(name + "дорогой");
        byte genM = 0;
        byte genW = 1;
        byte gender = scanner.nextByte();
        if (gender == genM) {
            System.out.println("Привет, дорогой " + name + ". Рад знакомству");
        } else if (gender == genW) {
            System.out.println("Привет, дорогая " + name + ". Рад знакомству");
        } else {
            System.out.println("Введите корректное имя и пол");
        }
    }
}
