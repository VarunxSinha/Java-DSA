import java.util.*;

class newstarpattern
{

	public static void main(String []args)
	{
		int i,j,k,n,s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		n=sc.nextInt();
		s=1;
		for(i=1; i<=n; i++)
		{
			for(j=1; j<=n-i; j++)
			{
			System.out.print(" ");
			}
			for(k=i; k>=1; k--)
			{
			System.out.print(k);
			}
			for(k=k+2; k<=i; k++)
			{
			System.out.print(k);
			}
		System.out.println();
		}
	}
}