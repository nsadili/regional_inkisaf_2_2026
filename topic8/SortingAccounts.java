package topic8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingAccounts {
    public static void main(String[] args) {

        List<Account> accounts = new ArrayList<>(
                List.of(
                        new Account("John", "Smith", 1000.0),
                        new Account("Jane", "Doe", 1500.0),
                        new Account("Jane", "Johnson", 800.0),
                        new Account("Bob", "Jackson", 800.0),
                        new Account("Alice", "Johnson", 1200.0),
                        new Account("Bob", "Brown", 800.0)));

        // Collections.sort(accounts, new Comparator<Account>() {
        // public int compare(Account o1, Account o2) {
        // return o1.getFirstName().compareTo(o2.getFirstName());
        // };
        // });
        Collections.sort(accounts);

        System.out.println(accounts);

    }
}

class Account implements Comparable<Account> {
    private String firstName;
    private String lastName;
    private Double balance;

    public Account(String firstName, String lastName, Double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    public Double getBalance() {
        return balance;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString() {
        return String.format("%s %s: %.2f", firstName, lastName, balance);
    };

    public int compareTo(Account o) {
        // this
        // o
        int diffBalance = this.balance.compareTo(o.getBalance());
        if (diffBalance != 0)
            return diffBalance;

        int diffFirstName = this.firstName.compareTo(o.getFirstName());
        if (diffFirstName != 0)
            return diffFirstName;

        return this.lastName.compareTo(o.getLastName());
    };
}