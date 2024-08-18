import java.util.*;

class abc
{

	public static void main(String []args)
	{
		int i,j,n,k;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
				
					for(j=1,k=2,j<=i;k>0;j++,k--)
					{
						System.out.print(j);
					}	
			
				System.out.print(k);

			
			System.out.println(" ");
		}
	}
}