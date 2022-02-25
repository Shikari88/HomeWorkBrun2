package HWLesson3;

public class Employee {
    String name;
    String surname;
    String patronymic;
    String position;
    String email;
    int phone;
    int salary;
    int age;

    void showInfo(){
        System.out.println("ФИО: " + name + " " + surname + " " + patronymic + "; Возраст: " + age + "; Позиция: " + position + "; Email: " + email + "; Телефон: " + phone + "; Зарплата (в ветках): " + salary + ".");
    }
}
