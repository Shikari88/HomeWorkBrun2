package HWLesson5.Print;

public class Test {

    /*3.Hard
        а) Создать интерфейс Printable, содержащий метод void print().
        б) Создать класс Book, реализующий интерфейс Printable.
        в) Создать класс Magazine, реализующий интерфейс Printable.
        г) Реализовать в обоих класса методы(print)
        д) Создать класс Printer - в котором будет метод print для печати журнала и книги (Пример: void print(Printable printable))
        e) В классе тест создать Журнал , Книгу и Принтер ,протестировать метод print объекта Printer
    */
    public static void main(String[] args) {

        Book book = new Book();
        Magazine magazine = new Magazine();
        Printer printer = new Printer();

        printer.print(magazine);
        printer.print(book);
    }
}
