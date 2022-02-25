package HWLesson5.Print;
/*  д) Создать класс Printer - в котором будет метод print
 для печати журнала и книги (Пример: void print(Printable printable))*/
public class Printer {

    void print(Book book){
        System.out.println("Эта книга напечатана");
    }

    void print(Magazine magazine){
        System.out.println("Этот журнал напечатан");
    }

}
