import java.util.Scanner;

class showroom 
{

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the purchase amount:");
        double amount = sc.nextDouble();
        
        System.out.println("Enter the type of cloth (1. Mill 2. Handloom items 3. Both):");
        int item = sc.nextInt();
        
        Cloth cloth = new Cloth();
        double discount = cloth.calculateDiscount(amount, item);
        
        double discountAmount = (discount / 100) * amount;
        double netAmount = amount - discountAmount;
        
        System.out.println("Net amount to be paid: " + netAmount);
    }
}

class Cloth {

    double calculateDiscount(double amount, int item) {
        double discount = 0;

        if (item == 1) 
		{  
            if (amount > 0 && amount <= 100) 
			{
                discount = 0;
            } 
			else if (amount > 100 && amount < 200) 
			{
                discount = 5.0;
            } 
			else if (amount > 200 && amount < 300) 
			{
                discount = 7.5;
            } 
			else if (amount > 300) 
			{
                discount = 10.0;
            }
        } 
		else if (item == 2) 
		{ 
            if (amount > 0 && amount <= 100) 
			{
                discount = 5.0;
            } 
			else if (amount > 100 && amount < 200) 
			{
                discount = 7.5;
            } 
			else if (amount > 200 && amount < 300) 
			{
                discount = 10.0;
            } 
			else if (amount > 300) 
			{
                discount = 15.0;
            }
        }

        return discount;
    }
}
