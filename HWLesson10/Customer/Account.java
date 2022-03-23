package HWLesson10.Customer;

public class Account {
    /*
    Создать класс Account
    с 3 полями:
        целое число id
        объект класса Customer с именем customer
        дробное число balance
    два конструктора:
        один принимает целое число для id и ссылку на объект Customer (balance при этом будет 0.0)
        другой принимает целое число для id, ссылку на объект Customer и дробное число для balance
    четыре метода:
        double put(double sum), который увеличивает balance на sum и возвращает balance
        double withdraw(double sum), который при возможноcти (balance - sum >= 0) уменьшает balance на sum и возвращает balance
        double deposit(int yearsNum, double percent), который расчитывает сколько будет денег через yearsNum лет
         под определенным количеством процентов
        переопределить toString(), для вывода в формате "name[customerType()]{id}: balance"
 */
    private int id;
    Customer customer;
    private double balance;

    public Account(int id, Customer customer){
        this.id = id;
        this.customer = customer;
    }

    public Account(int id, Customer customer, double balance){
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }



    /*double put(double sum), который увеличивает balance на sum и возвращает balance*/
    
    public double put(double sum){
        balance += sum;
        return balance;
    }



    //double withdraw(double sum), который при возможноcти (balance - sum >= 0) уменьшает balance на sum и возвращает balance
    public double withdraw(double sum) {
        if(balance - sum >= 0) {
            balance -= sum;
            return balance;
        }
        return -1;
    }

    /*double deposit(int yearsNum, double percent), который расчитывает сколько будет денег через yearsNum лет
    под определенным количеством процентов*/

    public double deposit(int yearsNum, double percent) {
        percent = percent/100;
        double total = balance * (1 + percent*yearsNum/365*100);
        return total;
    }

    //переопределить toString(), для вывода в формате "name[customerType()]{id}: balance"
    @Override
    public String toString() {
        return customer.getName() + "[" +
                customer.customerType(customer.getAge()) +"]" +
                "{" + id + "}: " + balance;
    }
}
