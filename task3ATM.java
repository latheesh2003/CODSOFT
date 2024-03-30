import java.util.*;
class bankaccount
{
    private double balance;
    public bankaccount(double initialbalance)
    {
        balance=initialbalance;
    }
    public double getbalance()
    {
        return balance;
    }
    public void deposit(double amount)
    {
        balance=balance+amount;
    }
    public boolean withdraw(double amount)
    {
        if(amount>balance)
        {
            return false;
        }
        balance=balance-amount;
        return true;
    }
}
class ATM{
    private bankaccount account;
    public ATM(bankaccount account)
    {
        this.account=account;
    }
    public void withdraw(double amount)
    {
        if(amount<=0)
        {
            System.out.println("invalid amount.");
        }
        else if(account.withdraw(amount))
        {
            System.out.println("withdrawal successful. current balance: $ "+account.getbalance());
        }
        else
        {
            System.out.println("insufficient balance. current balance: $"+account.getbalance());
        }
        }
        public void deposit(double amount)
        {
            if(amount<=0)
            {
                System.out.println("invalid amount.");
            }
            else{
                account.deposit(amount);
                System.out.println("deposit successful. current balance: $"+account.getbalance());
            }
        }
        public void checkBalance()
        {
            System.out.println("current balance: $"+account.getbalance());
        }
    }
    public class task3ATM
    {
        public static void main(String args[])
        {
            bankaccount useraccount=new bankaccount(1000);
            ATM atm=new ATM(useraccount);
            Scanner sc=new Scanner(System.in);
            while(true)
            {
                System.out.println("\nwelcome to ATM. choose an option:");
                System.out.println("1.withdraw");
                System.out.println("2.deposit");
                System.out.println("3.check balance");
                System.out.println("4.exit");
                int choice=sc.nextInt();
                switch(choice)
                {
                    case 1:
                    System.out.print("enter amount to withdraw: $");
                    double withdrawamount=sc.nextDouble();
                    atm.withdraw(withdrawamount);
                    break;
                    case 2:
                    System.out.print("enter amount to deposit: $");
                    double depositamount=sc.nextDouble();
                    atm.deposit(depositamount);
                    break;
                    case 3:
                    atm.checkBalance();
                    break;
                    case 4:
                    System.out.println("Thankyou for using the atm.goodbye:");
                    System.exit(0);
                    default: 
                    System.out.println("invalid choice. please try again.");
                }

            }
        }
    }