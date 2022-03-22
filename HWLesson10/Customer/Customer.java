package HWLesson10.Customer;

public class Customer {
    /*
    Создать класс Customer
    с 3 полями:
        целое число id
        строка name
        целое число age
    конструктор, задающий все три поля
    два метода:
        String customerType(),
            который вернет "deny" для возраста <14,
            "teen" для 14<=age<21
            "regular" для 21<=age<65
            "retiree" для age>=65
        переопределить toString(), для вывода в формате "name[customerType()]{id}"
 */
    private int id;
    private String name;
    private int age;

    public Customer(int id, String name, int age) {
        setId(id);
        setName(name);
        setAge(age);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id < 0) throw new IllegalArgumentException("Id должен быть больше нуля");
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.trim().length() < 1) {
            throw new IllegalArgumentException("Значение name < 1");
        };
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0) throw new IllegalArgumentException("Возвраст не может быть меньше ноля");
        this.age = age;
    }

    /*
    String customerType(),
            который вернет "deny" для возраста <14,
            "teen" для 14<=age<21
            "regular" для 21<=age<65
            "retiree" для age>=65
    */
    public String customerType(int age) {
        if (age < 14) {
            return "deny";
        } else if (age < 21) {
            return "teen";
        } else if (age < 65) {
            return "regular";
        } else {
            return "retiree";
        }
    }
    //переопределить toString(), для вывода в формате "name[customerType()]{id}"
    @Override
    public String toString() {
        return name + "[" +
                customerType(getAge()) +"]" +
                "{" + id + "}";
    }
}
