import java.util.*;

class kaajukatlipattern
{

	public static void main(String []args)
	{
		int i,j,n,k;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		n=sc.nextInt();

		for(i=1; i<=n; i++)
		{
			for(j=1; j<=2*(n-i)+1; j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
				for(i=1; i<=n; i++)
				{
					for(j=1; j<2*i+1; j++)
					{
			
						System.out.println("*");
					}
		
				    	System.out.println(" ");
				}
	}
}