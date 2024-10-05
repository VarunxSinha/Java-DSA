import java.util.Scanner;

class BankSystem 
{
    public static void main(String[] args) 
    {
        BankAccount myAccount = new SavingAccount(); // or new CurrentAccount();
        myAccount.displayAccountDetails();

        myAccount.deposit(500);
        myAccount.withdraw(200);
        myAccount.checkBalance();
    }
}

// Base class for bank accounts
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

// Derived class for Saving Account
class SavingAccount extends BankAccount 
{
    SavingAccount() 
    {
        // Initializing the base class constructor's attributes
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of depositor:");
        name = sc.nextLine();

        System.out.println("Enter the Account Number:");
        accNumber = sc.nextInt();

        System.out.println("Enter the initial deposit amount:");
        balance = sc.nextInt();
    }

    @Override
    void displayAccountDetails() 
    {
        System.out.println("Name of depositor: " + name);
        System.out.println("Account Number: " + accNumber);
        System.out.println("Account Type: Saving Account");
        System.out.println("Initial deposit amount: " + balance);
    }
}

// Derived class for Current Account
class CurrentAccount extends BankAccount 
{
    CurrentAccount() 
    {
        // Initializing the base class constructor's attributes
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of depositor:");
        name = sc.nextLine();

        System.out.println("Enter the Account Number:");
        accNumber = sc.nextInt();

        System.out.println("Enter the initial deposit amount:");
        balance = sc.nextInt();
    }

    @Override
    void displayAccountDetails() 
    {
        System.out.println("Name of depositor: " + name);
        System.out.println("Account Number: " + accNumber);
        System.out.println("Account Type: Current Account");
        System.out.println("Initial deposit amount: " + balance);
    }
}
