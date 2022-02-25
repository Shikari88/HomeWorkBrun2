package HWLesson5.IPhoneTask;

/*1.Easy
Создать класс iPhone с полями модель,вес,кол-во сим-карт,ширина,высота,тип материала(металл или стекло)
 и переопределить в нем методы toString /equals/hashCode
В toString использовать любой вариант форматирования строк для вывода информации об объекте,т.е.
отредактируйте toString под себя,как вы хотите
В equals определите свое правило сравнение объектов (напрмер:сравнивайте по всем полям кроме одного)
*/

public class App {
    public static void main(String[] args) {
        IPhone iPhone4 = new IPhone("4S",3.4,1, 4,8,"Металл");
        IPhone iPhone4G = new IPhone("4S",3.4,1, 4,8,"Металл");
        IPhone iPhone4S = new IPhone("4S",3.4,1, 4,8,"Стекло");
        IPhone iPhone5 = new IPhone("5S",4.4,1, 5,9,"Металл");
        IPhone iPhone10 = new IPhone("X",10.4,1, 7,15,"Стекло");

        System.out.println(iPhone4S);
        System.out.println(iPhone5);
        System.out.println(iPhone10);

        System.out.println(iPhone5.equals(iPhone4S));
        System.out.println(iPhone4.equals(iPhone4S));
        System.out.println(iPhone4.equals(iPhone4G));
        System.out.println(iPhone4S.equals(iPhone4));

        System.out.println(iPhone4G.hashCode());
        System.out.println(iPhone4.hashCode());
        System.out.println(iPhone5.hashCode());
        System.out.println(iPhone10.hashCode());


    }
}
