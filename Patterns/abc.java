import java.util.*;

class abc
{

	public static void main(String []args)
	{
		int i,j,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		n=sc.nextInt();

		for(i=1; i<=n; i++)
		{
			for(j=1; j<=n-i; j++)
			{
				System.out.print(j);
			}
				System.out.println();
		}
	}
}