package HWLesson4.Book;

import java.util.Arrays;

public class Storage {
    //    хранилище вмещает в себя максимум 20 книг
    //    Класс хранилище должен уметь добавлять книгу, при наличии свободного места?
    private int sizeStorage;
    private Book[] books = new Book[20];

    public Storage(int sizeStorage) {
        if(sizeStorage > 20) throw new IllegalArgumentException("Хранилище вмещает только 20 книг");
        this.sizeStorage = sizeStorage;
    }

    public void addBook(Book bookJava) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = bookJava;
                return;
            }
        }
    }

    @Override
    public String toString() {
        return "Storage{" +
                "sizeStorage=" + sizeStorage +
                ", books=" + Arrays.toString(books) +
                '}';
    }
}
