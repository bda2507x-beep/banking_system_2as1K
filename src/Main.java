import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter data for customer " + i);

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();

            System.out.print("Account number: ");
            String accNum = scanner.next();

            System.out.print("Balance: ");
            double balance = scanner.nextDouble();
            scanner.nextLine();

            Account account = new Account(accNum, balance);
            Customer customer = new Customer(name, age, account);
            bank.addCustomer(customer);
        }

        System.out.println("\n All Customers ");
        for (Customer c : bank.getCustomers()) {
            System.out.println(c);
        }

        System.out.println("\n Sorted by Balance ");
        bank.sortByBalance();
        for (Customer c : bank.getCustomers()) {
            System.out.println(c);
        }

        System.out.println("\n Filter balance >= 1000 ");
        for (Customer c : bank.filterByMinBalance(1000)) {
            System.out.println(c);
        }

        System.out.print("\nSearch customer by name: ");
        String searchName = scanner.nextLine();
        Customer found = bank.findByName(searchName);

        if (found != null) {
            System.out.println("Found: " + found);
        } else {
            System.out.println("Customer not found");
        }

        scanner.close();
    }
}
