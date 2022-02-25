package HWLesson2;
import java.util.Arrays;

//создать массив размером 100 и заполнить его числами Фибоначчи
public class Fibonacci {
    public static void main(String[] args) {
        long [] arr = new long[100];
        for (int i = 0; i < arr.length; i++) {
            if(i < 2){
                arr[i] = 1;
            } else {
                arr[i] = arr[i - 2] + arr[i - 1];
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
