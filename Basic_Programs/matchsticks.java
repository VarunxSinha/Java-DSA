import java.util.*;

class matchsticks
{

	public static void main(String []args)
	{
		int i=21,j,n;
		Scanner sc=new Scanner(System.in);
		
		while(i>=1)
		{
			System.out.println("Choose Any Number between (1 to 4):");
			j=sc.nextInt();
			
			if(j>4 || j<1)
			{
				System.out.println("Invalid Entry");
                break;
            }

            n = 5 - j;
            System.out.println("Computer picks up " + n + " match sticks.");
            i = i - j - n;
            if (i == 1) {
                System.out.println("\nYou have lost to the computer.");
                break;
            }
        }
    }
}

	
	
