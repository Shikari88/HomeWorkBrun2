package HWLesson4.Book;

public class Book {
    //    Есть класс Книга с полями - название(имя) книги, кол-во страниц, год публикации,
    //    авторы (их может быть несколько).

    private String name;
    private int countPages;
    private int publicationYear;
    private Writer[] writers;


    public Book(String name, int countPages, int publicationYear, Writer[] writers){
        setName(name);
        setCountPages(countPages);
        setPublicationYear(publicationYear);
        this.writers = writers;
    }

    public Writer[] getWriters() {
        return writers;
    }
//
//    public void setWriters(Writer[] writers) {
//
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.trim().length() < 1) {
            throw new IllegalArgumentException("Значение name < 1");
        };
        this.name = name;
    }

    public int getCountPages() {
        return countPages;
    }

    public void setCountPages(int countPages) {
        if(countPages < 1) throw new IllegalArgumentException("Это не книга");
        this.countPages = countPages;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        if(publicationYear > 2022) throw new IllegalArgumentException("Данный год еще не наступил");
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", countPages=" + countPages +
                ", publicationYear=" + publicationYear +
                '}';
    }
}
