package HWLesson4.Book;

public class Writer {
    //    Есть класс Автор с полями имя, фамилия.
    private String name;
    private String surname;


    public Writer (String name, String surname){
        setName(name);
        setSurname(surname);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.trim().length() < 1) {
            throw new IllegalArgumentException("Значение name < 1");
        }
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname.isEmpty() || surname.trim().length() < 1) {
            throw new IllegalArgumentException("Значение surname < 1");
        }
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Writer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
