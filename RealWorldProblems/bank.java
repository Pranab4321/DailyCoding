class bankAccount{
    private String accountHolder;
    private String accountNumber;
    private double balance;

    //ArrayList to store transaction
    private ArrayList<String> transactions;

    // constructor
    bankAccount(String accountHolder,String accountNumber){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    //Deposit method
    public void deposit(double amount){
        if(amount<0){
            System.out.println("Invalid amount to deposit.");
            return;
        }

        balance += amount;
        transactions.add("Deposited Amount "+ amount);
        System.out.println("Rupees "+ amount + "is deposited successfully.");

    }

    //Withdraw method
    public void withdraw(double amount){
        if(amount<0){
            System.out.println("Invalid amount to deposit.");
            return;
        }

        if(amount<balance){
            System.out.println("Insufficient balance.");
            return;
        }

        balance -= amount;
        transactions.add("Withdrawn Amount "+ amount);
        System.out.println("Rupees "+ amount + "is withdrawn successfully.");
    }

    //Check balance
    public void checkBalance(){
        System.out.println("The current account balance :"+ balance);
    }

    //Display transaction history
    public void transactions(){
        if(transactions.isEmpty()){
            System.out.println("No transactions yet.");
            return;
        }

        System.out.println("-----------Transactions-----------");

        for(String transaction : transactions){
            System.out.println(transaction);
        }

        System.out.println("----------------------------------");
    }

    //getter methods
    public String getAccountNumber(){
        return accountNumber;
    }

    public String getAccountHolder(){
        return accountHolder;
    }
}

public class bank{
    public static void main(String[] args){

    }
}