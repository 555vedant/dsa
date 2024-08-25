package oop;
import java.util.ArrayList;
import java.util.List;

class Customer {
    private String name;
    private String address;
    private int customerId;

    public Customer(String name, String address, int customerId) {
      
        this.name = name;
        this.address = address;
        this.customerId = customerId;
    }

    // Getters and setters

    // Other methods as needed
}

class Account {
    private int accountNumber;
    private double balance;
    private Customer customer;

    public Account(int accountNumber, double balance, Customer customer) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customer = customer;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    public double checkBalance() {
        return balance;
    }

    // Other methods as needed
}

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int accountNumber, double balance, Customer customer, double interestRate) {
        super(accountNumber, balance, customer);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = checkBalance() * interestRate / 100;
        deposit(interest);
        System.out.println("Interest added. New balance: " + checkBalance());
    }

    // Other methods as needed
}

class CheckingAccount extends Account {
    private boolean overdraftProtection;

    public CheckingAccount(int accountNumber, double balance, Customer customer, boolean overdraftProtection) {
        super(accountNumber, balance, customer);
        this.overdraftProtection = overdraftProtection;
    }

    public void processCheck(double amount) {
        if (amount > 0) {
            if (overdraftProtection || amount <= checkBalance()) {
                withdraw(amount);
                System.out.println("Check processed successfully. New balance: " + checkBalance());
            } else {
                System.out.println("Insufficient funds for check processing.");
            }
        } else {
            System.out.println("Invalid check amount.");
        }
    }

    // Other methods as needed
}

class Bank {
    private List<Customer> customers;
    private List<Account> accounts;

    public Bank() {
        this.customers = new ArrayList<>();
        this.accounts = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void openAccount(Account account) {
        accounts.add(account);
    }

    public void closeAccount(Account account) {
        accounts.remove(account);
    }

    // Other methods as needed
}

public class projectbankingsystem {
    public static void main(String[] args) {
        // Create a bank
        Bank bank = new Bank();

        // Create a customer
        Customer customer = new Customer("John Doe", "123 Main St", 1);
        bank.addCustomer(customer);

        // Create a savings account for the customer
        SavingsAccount savingsAccount = new SavingsAccount(101, 1000.0, customer, 2.5);
        bank.openAccount(savingsAccount);

        // Create a checking account for the customer
        CheckingAccount checkingAccount = new CheckingAccount(201, 500.0, customer, true);
        bank.openAccount(checkingAccount);

        // Perform transactions
        savingsAccount.deposit(200.0);
        checkingAccount.processCheck(100.0);
        savingsAccount.addInterest();

        // Print customer information
        System.out.println("Customer: " + customer.getName() + ", ID: " + customer.getCustomerId());
        System.out.println("Savings Account Balance: " + savingsAccount.checkBalance());
        System.out.println("Checking Account Balance: " + checkingAccount.checkBalance());
    }
}
