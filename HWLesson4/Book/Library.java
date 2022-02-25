package HWLesson4.Book;

public class Library {
    //Есть класс Библиотека с полями: книги и номер хранилища,
    private Book[] books;
    private int storageNumber;

    public int getStorageNumber() {
        return storageNumber;
    }

    public void setStorageNumber(int storageNumber) {
        this.storageNumber = storageNumber;
    }
}
