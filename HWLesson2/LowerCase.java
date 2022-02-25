package HWLesson2;
import java.util.Scanner;

public class LowerCase {
    public static void main(String[] args) {

        //Проверить, что в строке только латинские буквы нижнего регистра

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        boolean latin = s.matches("^[a-zA-Z]+$");
        String s1 = s.toLowerCase();
        if(latin && s.equals(s1)){
            System.out.println("Нижний регистр");
        } else {
            System.out.println("Прочитайте условие задачи");
        }
    }
}
