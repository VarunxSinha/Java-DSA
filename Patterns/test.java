import java.util.*;

class test
{
	public static void main(String []args)
	{
		int n,i,j;
		Scanner sc = new Scanner(System.in);
      
        System.out.println("Enter a string: ");
        String Str = sc.nextLine();
		for(i=0; i<Str.length(); i++)	
		{
			for(j=0; j<=i; j++)
			{
				System.out.print(Str.charAt(j));
			}
			System.out.println();
		}
	}
}

	
