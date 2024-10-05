import java.util.*;

class VoterID 
{
    public static void main(String []args) throws ArithmeticException 
	{
        int age;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the age of the person: ");
        age = sc.nextInt();

        if (age >= 18)
		{
            System.out.println("You are eligible to vote!!!");
        } 
		else 
		{
            throw new ArithmeticException("You are under age...");
        }
    }
}
