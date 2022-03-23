package HWLesson10.Customer;

public class App {
    public static void main(String[] args) {
        //Task 1
        Customer customer = new Customer(1,"John", 27);
        Customer customer1 = new Customer(2,"Jane", 14);
        Customer customer2 = new Customer(3,"Hanna", 65);

        //тест метода
        customer.customerType(customer.getAge());

        //вывод переопределенного toString
        System.out.println(customer);
        System.out.println(customer1);
        System.out.println(customer2);
        System.out.println();//для разделения вывода по задачам

        //Task 2

        Account account = new Account(1, customer, 5000.01);
        Account account1 = new Account(2, customer1, 600.02);
        Account account2 = new Account(3, customer2, 1000.01);

        //тест методов
        System.out.println(account.put(1000.00));
        System.out.println(account1.withdraw(200.00));
        System.out.println(account2.deposit(1,2));

        //вывод переопределенного toString
        System.out.println(account);
        System.out.println(account1);
        System.out.println(account2);



    }
}
