import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Customer> customers = new ArrayList<>();

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }


    public Customer findByName(String name) {
        for (Customer c : customers) {
            if (c.getName().equals(name)) {
                return c;
            }
        }
        return null;
    }


    public List<Customer> filterByMinBalance(double minBalance) {
        List<Customer> result = new ArrayList<>();
        for (Customer c : customers) {
            if (c.getAccount().getBalance() >= minBalance) {
                result.add(c);
            }
        }
        return result;
    }


    public void sortByBalance() {
        customers.sort((c1, c2) ->
                Double.compare(
                        c1.getAccount().getBalance(),
                        c2.getAccount().getBalance()
                )
        );
    }

    public List<Customer> getCustomers() {
        return customers;
    }
}

