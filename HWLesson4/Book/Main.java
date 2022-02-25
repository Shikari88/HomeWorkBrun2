package HWLesson4.Book;

public class Main {
    //    1.Task
    //    Есть класс Книга с полями - название(имя) книги, кол-во страниц, год публикации,
    //    авторы (их может быть несколько).
    //    Год публикации не может быть больше текущего года.
    //    Есть класс Автор с полями имя, фамилия.
    //    Есть класс Библиотека с полями: книги и номер хранилища, хранилище вмещает в себя максимум 20 книг
    //    Класс хранилище должен уметь добавлять книгу, при наличии свободного места

    public static void main(String[] args) {
        Writer herb = new Writer("Herbert", "Schildt");
        Book bookJava = new Book("Java8", 712, 2015, new Writer[]{herb});
        Storage storage1 = new Storage(20);
        storage1.addBook(bookJava);
        System.out.println(storage1);
    }
}
