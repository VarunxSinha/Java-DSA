import java.util.*;

class newpattern
{

	public static void main(String []args)
	{
		int i,j,n,k;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		n=sc.nextInt();

		for(i=1; i<=n; i++)
		{
			for(j=1, k=i; j<=i; j++)
			{
				System.out.print(k);
				k=k+5;
			}
				System.out.println();
		}
	}
}