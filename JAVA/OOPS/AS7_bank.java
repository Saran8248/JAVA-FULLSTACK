import java.util.ArrayList;

class Account {
    private String accountNumber;
    private String customerName;
    private double balance;

    public Account(String accountNumber, String customerName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + " into account " + accountNumber);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + " from account " + accountNumber);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    public void display() {
        System.out.println("Account Number: " + accountNumber + ", Customer Name: " + customerName + ", Balance: $" + balance);
    }

    public Object getAccountNumber() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAccountNumber'");
    }
}

class Bank {
   
    private ArrayList<Account> accounts;

  
    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account added: " + account.getAccountNumber());
    }

    public void removeAccount(String accountNumber) {
        accounts.removeIf(account -> account.getAccountNumber().equals(accountNumber));
        System.out.println("Account removed: " + accountNumber);
    }

    public void displayAllAccounts() {
        System.out.println("All accounts in the bank:");
        for (Account account : accounts) {
            account.display();
        }
    }

    public static void main(String[] args) {
        Bank bank = new Bank();

        Account account1 = new Account("001", "Alice Smith", 1000);
        Account account2 = new Account("002", "Bob Johnson", 2000);

        bank.addAccount(account1);
        bank.addAccount(account2);

        bank.displayAllAccounts();

        account1.deposit(500);
        account1.withdraw(300);
        account2.withdraw(500);

        System.out.println("\nAfter transactions:");
        bank.displayAllAccounts();

        bank.removeAccount("001");

        System.out.println("\nAfter removing an account:");
        bank.displayAllAccounts();
    }
}
