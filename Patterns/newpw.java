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
				
					for(j=1;j<=i;j++)
					{


						for(k=i;k>0;k--)
						{
							System.out.print(k);
						}	
			
					}

			
			System.out.println(" ");
		}
	}
}