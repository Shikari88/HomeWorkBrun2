package HWLesson6;

import java.util.Arrays;

/*2, 3.Tasks
 - Создать final class ArrayOperations
 - Написать три static метода

 / ..... /

 - В psvm проверить работу этих методов
*/
final class ArrayOperations {
    /*- Методы max и min, которые принимает как аргумент массив int чисел и возвращают индексы
    максимума и минимума соответственно.*/
    public static int max(int[] ints){
        int maxNum = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > ints[maxNum]) {
                maxNum = i;
            }
        }
        return maxNum;
    }

    public static int min(int[] ints){
        int minNum = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] < ints[minNum]){
                minNum = i;
            }
        }
        return minNum;
    }

    /*- Метод indexOf, который принимает как аргумент массив int чисел и одно int число,
        возвращает индекс этого числа или -1 если его в массиве нет*/
    public static int indexOf(int[] ints,int num){
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == num) return i;
        }
        return -1;
    }

    /*Метод sum, который принимает как аргумент массив int чисел
     и возвращает сумму этих чисел в массиве */

    public static int sum(int [] ints) {
        int sumArr = 0;
        for (int i = 0; i < ints.length; i++) {
            sumArr += ints[i];
        }
        return sumArr;
    }

    /*Метод replace ,который принимает как аргумент массив int чисел и
    два числа int именами oldInt newInt, и изменяет все oldInt в массиве
     на newInt(метод ничего не возвращает ,а только меняет содержимое массива )*/

    public static void replace(int[] ints, int oldInt, int newInt) {
        for (int i = 0; i < ints.length; i++) {
             if (oldInt == ints[i]) {
                 ints[i] = newInt;
             }
        }
    }

    public static void main(String[] args) {
        int[] numArray = new int[]{25,376,589,376,9};
        System.out.println(max(numArray));
        System.out.println(min(numArray));
        int num = 589;
        System.out.println(indexOf(numArray, num));
        System.out.println(sum(numArray));
        replace(numArray,376, 666);
        System.out.println(Arrays.toString(numArray));
    }
}


