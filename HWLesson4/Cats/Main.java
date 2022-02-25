package HWLesson4.Cats;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        2. Task
//        Есть класс Кот с полями имя, цвет, скорость, вес, мыши!
//        Есть класс Мышь, которая имеет только одно поле - скорость
//        Кот может ловить мышь, если его скорость больше скорости мыши, иначе мышь убегает.
//       *Кот может атаковать другого кота, если его вес больше веса атакующего, то кот забирает всех мышей у атакующего кота .Забрать мышь к себе он может, при условии, что его скорость больше скорости мышки.
        Cat cat1 = new Cat("Barsik", "black", 10.4,4, new Mouse[6]);
        Cat cat2 = new Cat("Rupert", "yellow", 12.4,2, new Mouse[6]);

        Mouse mouse1 = new Mouse(6);
        Mouse mouse2 = new Mouse(13);
        Mouse mouse3 = new Mouse(16);
        Mouse mouse4 = new Mouse(12);
        Mouse mouse5 = new Mouse(3);
        Mouse mouse6 = new Mouse(2);

        //здесь как-то по-компактнее наверное можно сделать
        cat1.catchMouse(mouse1);
        cat1.catchMouse(mouse2);
        cat1.catchMouse(mouse3);
        cat1.catchMouse(mouse4);
        cat2.catchMouse(mouse5);
        cat2.catchMouse(mouse6);

        cat1.attackCat(cat2);

        System.out.println(cat1);
        System.out.println(cat2);

    }
}
