package HWLesson8;

import java.util.*;

public class SameWords {
    /*Easy.
    Дан список слов(например, words).
    Написать статический метод, который будет возвращать количество одинаковых слов
    с списке в виде Map<String, Integer>, где String - слово и Integer - количество повторений

    List<String> words = new ArrayList<>();
    words.add("may");
    words.add("august");
    words.add("june");
    words.add("may");
    words.add("may");
    words.add("july");
    words.add("may");
    words.add("august");
    words.add("august");*/
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("may");
        words.add("august");
        words.add("june");
        words.add("may");
        words.add("may");
        words.add("july");
        words.add("may");
        words.add("august");
        words.add("august");
        System.out.println(returnSameWord(words));
    }
    public static HashMap<String, Integer> returnSameWord(List<String> words) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String s: words) {
            if (hashMap.containsKey(s)) {
                hashMap.put(s, hashMap.get(s) + 1);
            } else {
                hashMap.put(s, 1);
            }
        }
        return hashMap;
    }
}
