import java.util.Scanner;

class UserBankAccount 
{
    private double balance;

    public UserBankAccount(double initialBal) 
    {
        this.balance = initialBal;
    }

    public void checkBalance() 
    {
        System.out.println("Your current account balance is: " + balance);
    }

    public void deposit(double amountToDeposit) 
    {
        balance = balance + amountToDeposit;
        System.out.println("Deposit is completed.");
        System.out.println("Your updated balance after deposit is: "+balance);
    }

    public void withdraw(double amountToWithdraw) 
    {
        if (amountToWithdraw <= balance) 
        {
            balance = balance - amountToWithdraw;
            System.out.println("Withdrawal is completed.");
            System.out.println("Your updated balance is: " + balance);
        }
        else
        {
            System.out.println("Insufficient balance to withdraw");
        }
    }
}

class ATMInterface 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter initial balance:");
        double initialBal = sc.nextDouble();

        UserBankAccount obj = new UserBankAccount(initialBal);

        while (true) 
        {
            System.out.println("Enter your choice to perform:");
            System.out.println("1->Check Balance");
            System.out.println("2->Deposit Amount");
            System.out.println("3->Withdraw Amount");
            System.out.println("4->Exit the process");

            int ch = sc.nextInt();

            switch (ch) 
            {
                case 1:
                    obj.checkBalance();
                    break;
                case 2:
                        System.out.println("Enter the amount to deposit into your account:");
                        double amountToDeposit = sc.nextDouble();
                        obj.deposit(amountToDeposit);
                        break;
                case 3:
                    System.out.println("Enter the amount to withdraw from your account:");
                    double amountToWithdraw = sc.nextDouble();
                    obj.withdraw(amountToWithdraw);
                    break;
                case 4:
                    System.out.println("Exited");
                    System.out.println("Thank you and visit again");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        }
    }
}
