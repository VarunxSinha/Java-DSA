import java.util.*;

class Exception
 {
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to divide:");
        int s = sc.nextInt();
		
		System.out.println("Enter the number 2 to divide :");
		int w = sc.nextInt();

        try 
		{
            int result = s / w;
            System.out.println("Result of division: " + result);
			int[] numbers = {1, 2, 3};
            System.out.println("Accessing an element out of bounds: " + numbers[5]);
        } 
		catch (ArithmeticException e) 
		{
            System.out.println("Error: Cannot divide by zero.");
        }
		catch (ArrayIndexOutOfBoundsException e) 
		{
            System.out.println("Error: Array index is out of bounds.");
        }

        finally 
		{
            System.out.println("Finally block is always executed.");
        }

        System.out.println("Program continues after exception handling.");
    }
}
