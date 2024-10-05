import java.util.Scanner;

class BankSystem 
{
    public static void main(String[] args) 
    {
        BankAccount myAccount = new SavingAccount(); 
        myAccount.displayAccountDetails();

        myAccount.deposit(500);
        myAccount.withdraw(200);
        myAccount.checkBalance();
    }
}

class BankAccount 
{
    String name;
    int accNumber;
    int balance;

    BankAccount() 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of depositor:");
        name = sc.nextLine();

        System.out.println("Enter the Account Number:");
        accNumber = sc.nextInt();

        System.out.println("Enter the initial deposit amount:");
        balance = sc.nextInt();
    }

    void deposit(int amount) 
    {
        if (amount > 0) 
        {
            balance += amount;
            System.out.println("Successfully deposited " + amount);
        } 
        else 
        {
            System.out.println("Invalid deposit amount.");
        }
    }

    void withdraw(int amount) 
    {
        if (amount > 0 && amount <= balance) 
        {
            balance -= amount;
            System.out.println("Successfully withdrew " + amount);
        } 
        else if (amount > balance) 
        {
            System.out.println("Insufficient balance.");
        } 
        else 
        {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    void checkBalance() 
    {
        System.out.println("Current balance: " + balance);
    }

    void displayAccountDetails() 
    {
        System.out.println("Name of depositor: " + name);
        System.out.println("Account Number: " + accNumber);
    }
}


class SavingAccount extends BankAccount 
{
    SavingAccount() 
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of depositor:");
        name = sc.nextLine();

        System.out.println("Enter the Account Number:");
        accNumber = sc.nextInt();

        System.out.println("Enter the initial deposit amount:");
        balance = sc.nextInt();
    }

    void displayAccountDetails() 
    {
        System.out.println("Name of depositor: " + name);
        System.out.println("Account Number: " + accNumber);
        System.out.println("Account Type: Saving Account");
        System.out.println("Initial deposit amount: " + balance);
    }
}

class CurrentAccount extends BankAccount 
{
    CurrentAccount() 
    {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of depositor:");
        name = sc.nextLine();

        System.out.println("Enter the Account Number:");
        accNumber = sc.nextInt();

        System.out.println("Enter the initial deposit amount:");
        balance = sc.nextInt();
    }


    void displayAccountDetails() 
    {
        System.out.println("Name of depositor: " + name);
        System.out.println("Account Number: " + accNumber);
        System.out.println("Account Type: Current Account");
        System.out.println("Initial deposit amount: " + balance);
    }
}
