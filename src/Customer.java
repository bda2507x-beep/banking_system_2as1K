import java.util.Objects;

public class Customer extends Person {
    private int age;
    private Account account;

    public Customer(String name, int age, Account account) {
        super(name);
        this.age = age;
        this.account = account;
    }

    public int getAge() {
        return age;
    }

    public Account getAccount() {
        return account;
    }

    @Override
    public String getRole() {
        return "Customer";
    }

    @Override
    public String toString() {
        return "Customer{name='" + name +
                "', age=" + age +
                ", balance=" + account.getBalance() + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return name.equals(customer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

