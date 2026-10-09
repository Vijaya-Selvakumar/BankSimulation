import java.util.Scanner;

public class BankSimulaion {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter account holder name: ");
        String name=sc.nextLine();

        System.out.println("Enter intial deposit amount: ");
        double initialBalance = sc.nextDouble();

        while (initialBalance<0)
        {
            System.out.println("Initial balance cannot be negative. Enter again: ");

            initialBalance=sc.nextDouble();
        }

        Account account = new Account(name, initialBalance);

        int choice;
        do{
            System.out.println("\n-------Bank Menu------");

            System.out.println("1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Check Balance");
            System.out.println("4.Transaction History");
            System.out.println("5.Exit");

            System.out.println("Enter your choice: ");
            choice =  sc.nextInt();
             switch (choice) {
                case 1:
                    System.out.println("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);         
                    break;

                case 2:
                    System.out.println("Enter Withdrawal amount: ");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 3:
                    account.checkBalance();
                    break;

                case 4:
                    account.showTransactions();
                    break;

                case 5:
                    System.out.println("Thank you for using our bank!");
                    break;
             
                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
             }
        }
        while(choice!=5);
            sc.close();
    }

    
}