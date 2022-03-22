package HWLesson7.HomeExample.LinkedList;

import java.util.LinkedList;

public class App {
    public static void main(String[] args) {

        String str7 = "Конец";
        String str1 = "Привет! Меня зовут LinkedList";
        String str2 = "Я двусвязный список";
        String str3 = "Я храню данные элемента";
        String str4 = "И ссылку на предыдущий и следующий элемент";
        String str5 = "Внутри меня нет массива";
        String str6 = "Вся работа со мной сводится к изменению ссылок";
        String str8 = "Я удобен, когда надо вставить что-то в середину списка";

        String str = "Начало";

        LinkedList <String> linkedListDesk = new LinkedList<>();

        linkedListDesk.add(str1);
        //linkedListDesk.add(str2);
        linkedListDesk.add(str3);
        linkedListDesk.add(str4);
        linkedListDesk.add(1, str2);
        linkedListDesk.add(str5);
        linkedListDesk.add(str6);
        System.out.println(linkedListDesk);


        //при удалении эл-ты не сдвигаются в отличии от массива, в них переопределяются ссылки
        linkedListDesk.remove(4);
        System.out.println(linkedListDesk);

        //Методы схожи с ArrayList. Но есть отличия
        //Вставка в начало и конец двусвязного списка
        linkedListDesk.addFirst(str);
        linkedListDesk.addLast(str7);
        System.out.println(linkedListDesk);

        //Возвращаем начальный и конечный элемент сохраняя их в списке. null - если эл-тов нет
        System.out.println(linkedListDesk.peekFirst());
        System.out.println(linkedListDesk.peekLast());

        //Возвращаем начальный и конечный элемент удаляя их из списка. null - если эл-тов нет
        System.out.println(linkedListDesk.pollFirst());
        System.out.println(linkedListDesk.pollLast());
        System.out.println(linkedListDesk);






    }
}
