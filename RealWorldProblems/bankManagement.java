import java.util.ArrayList;
import java.util.Scanner;

class BankAccount {

    // Encapsulation
    private String accountNumber;
    private String accountHolder;
    private double balance;

    // ArrayList to store transactions
    private ArrayList<String> transactions;

    // Constructor
    public BankAccount(String accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    // Deposit method
    public void deposit(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid amount.");
            return;
        }

        balance += amount;

        transactions.add("Deposited: ₹" + amount);

        System.out.println("₹" + amount + " deposited successfully.");
    }

    // Withdraw method
    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid amount.");
            return;
        }

        if (amount > balance) {
            System.out.println("Insufficient balance.");
            return;
        }

        balance -= amount;

        transactions.add("Withdrawn: ₹" + amount);

        System.out.println("₹" + amount + " withdrawn successfully.");
    }

    // Check balance
    public void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }

    // Display transaction history
    public void showTransactions() {

        if (transactions.isEmpty()) {
            System.out.println("No transactions yet.");
            return;
        }

        System.out.println("\n----- Transaction History -----");

        for (String transaction : transactions) {
            System.out.println(transaction);
        }

        System.out.println("-------------------------------");
    }

    // Getter methods
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
}


public class bankManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount account = null;

        while (true) {

            System.out.println("\n===== BANK ACCOUNT MANAGEMENT =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Transaction History");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    if (account != null) {
                        System.out.println("Account already exists.");
                        break;
                    }

                    sc.nextLine(); // clear buffer

                    System.out.print("Enter Account Number: ");
                    String accountNumber = sc.nextLine();

                    System.out.print("Enter Account Holder Name: ");
                    String name = sc.nextLine();

                    account = new BankAccount(accountNumber, name);

                    System.out.println("Account created successfully!");
                    System.out.println("Welcome, " + name);

                    break;


                case 2:

                    if (account == null) {
                        System.out.println("Please create an account first.");
                        break;
                    }

                    System.out.print("Enter amount to deposit: ₹");
                    double depositAmount = sc.nextDouble();

                    account.deposit(depositAmount);

                    break;


                case 3:

                    if (account == null) {
                        System.out.println("Please create an account first.");
                        break;
                    }

                    System.out.print("Enter amount to withdraw: ₹");
                    double withdrawAmount = sc.nextDouble();

                    account.withdraw(withdrawAmount);

                    break;


                case 4:

                    if (account == null) {
                        System.out.println("Please create an account first.");
                        break;
                    }

                    account.checkBalance();

                    break;


                case 5:

                    if (account == null) {
                        System.out.println("Please create an account first.");
                        break;
                    }

                    account.showTransactions();

                    break;


                case 6:

                    System.out.println("Thank you for using our bank.");
                    sc.close();
                    return;


                default:

                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}