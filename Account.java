import java.util.ArrayList;

public class Account {
    
    private String accountHolder;
    private double balance;
    private ArrayList<String> transactions;



Account(String accountHolder, double initialBalance)
{
    this.accountHolder = accountHolder;
    this.balance=initialBalance;
    transactions = new ArrayList<> ();

    transactions.add("Account created with balance: Rs. " + initialBalance);

}


public void deposit(double amount){
    if(amount>0)
    {
        balance+=amount;
        transactions.add("Deposited: Rs. "+amount);
        System.out.println("Amount deposited successfully!");
    }
    else{
        System.out.println("Invalid deposit amount");
    }

    }

public void withdraw(double amount)
{
    if(amount<=0)
    {
        System.out.println("Invalid withdrawal amount!");

    }
    else if(amount>balance)
    {
        System.out.println("Insufficient balance!");
    }
    else
    {
        balance-=amount;
        transactions.add("Withdrawal: Rs. "+amount);
        System.out.println("Amount withdrawn successfully!");
    }
}

public void checkBalance(){
    System.out.println("AccountHolder: "+accountHolder);
    System.out.printf("Available Balance: Rs. %.2f%n", balance);
}

public void showTransactions(){
    System.out.println(("\n------Transaction History------"));
    for (String transaction: transactions)
    {
        System.out.println(transaction);
    }

}
}
