package HWLesson7.HomeExample.List.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class App {
    public static void main(String[] args) {
        //Структуры данных. Коллекция ArrayList
        //output a list of Integer
//        ArrayList <Integer> intList = new ArrayList <Integer> ();
//        intList.add(2);
//        intList.add(3);
//        intList.add(0);
//        intList.add(9);
//        intList.add(8);
//        intList.add(-1);
//        System.out.println(intList.size());
//        System.out.println(intList);

        /*display a list of object of the class Guitar - выводим список объектов класса гитара*/
        ArrayList <Guitar> guitars = new ArrayList <>();
        Guitar ibanez = new Guitar("Ibanez",7, "Alder", true);
        Guitar gibson = new Guitar("Gibson", 6, "Ash", true);
        Guitar schecter = new Guitar("Schecter", 8, "Linden", false);
        Guitar fender = new Guitar("Fender", 6, "Mahogany", true);

        guitars.add(ibanez);
        guitars.add(gibson);

        //add element "schecter" at position index = 0;
        guitars.add(0, schecter);
        guitars.add(2, fender);
        //System.out.println(guitars);

        //get element at position = 0
        //System.out.println(guitars.get(0));

        //значение устанавливает, но не возвращает массив с изменениями
//        guitars.set(0, ibanez);
//        System.out.println(guitars);

        //удаляет эл и возвращает его. Массив выводиться уже без элемента
//        System.out.println(guitars.remove(0));
//        System.out.println(guitars.remove(gibson));
        System.out.println(guitars);

        //delete elements at list
//        guitars.clear();
//        System.out.println(guitars);

        //проверяем содержится ли элемент в списке
        //System.out.println(guitars.contains(schecter));


        //Сделали из списка массив
        Object [] objects = guitars.toArray();
        Guitar [] guitars1 = new Guitar[guitars.size()];
        guitars.toArray(guitars1);
        System.out.println("Это теперь массив " + Arrays.toString(guitars1));

        //System.out.println(guitars1[0]);
        //contains - не работает т.к. это метод списка :)
       // System.out.println(guitars1.contains(schecter));

        //выводим элемент массива из списка при условии
        for(Guitar g: guitars1){
            if(g.equals(fender)){
                System.out.println(g);
            }
        }

       // Iterator - метод интрефейста Collection - возвращает объект, реализующий интерфейс Iterator
        //Iterator - служит только для обхода списка
        Iterator<Guitar> iteratorGuitars = guitars.iterator();

        //пока в итерируемом элементе есть значения
        while (iteratorGuitars.hasNext()){
            //возвращаем следуюий элемент списка и сохоаняем его в g.
            Guitar g = iteratorGuitars.next();
            System.out.println(g);
        }


    }
}
