import java.util.ArrayList;
import java.util.List;

enum AccountType {
    SAVINGS, CURRENT
}

interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    double calculateInterest();
    double viewBalance();
}

class Bank {
    private List<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    public void printAllBalances() {
        for (Account account : accounts) {
            System.out.println("Account balance: " + account.viewBalance());
        }
    }
}

class SavingsAccount implements Account {
    private double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double calculateInterest() {
        return 0;
    }

    public double viewBalance() {
        return balance;
    }
}

class CurrentAccount implements Account {
    private double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double calculateInterest() {
        return 0;
    }

    @Override
    public double viewBalance() {
        return balance;
    }
}

public class task3 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        SavingsAccount savingsAccount = new SavingsAccount();
        bank.addAccount(savingsAccount);
        savingsAccount.deposit(1000);
        savingsAccount.withdraw(200);

        bank.printAllBalances();
    }
}
