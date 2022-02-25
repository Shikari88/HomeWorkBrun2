package HWLesson3;

public class Arithmetic {
    int x;
    int y;

    void numX(int a){
        if(a <= 0){
            System.out.println("Вы должны ввести значение больше 0");
        } else {
            x = a;
        }
    }

    void numY(int b){
        if(b <= 0){
            System.out.println("Вы должны ввести значение больше 0");
        } else {
            y = b;
        }
    }
}
