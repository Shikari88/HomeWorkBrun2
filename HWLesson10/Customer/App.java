package HWLesson10.Customer;

public class App {
    public static void main(String[] args) {
        Customer customer = new Customer(1,"John", 27);
        Customer customer2 = new Customer(2,"Jane", 14);
        Customer customer3 = new Customer(3,"Java", 65);
        customer.customerType(customer.getAge());

        System.out.println(customer);
        System.out.println(customer2);
        System.out.println(customer3);
    }
}
