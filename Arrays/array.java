import java.util.*;

class array
{
	public static void main(String []args)
	{
		int arr[]=new int[20];
		int n,m,i,t,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("How Many Number :");
		n=sc.nextInt();
		System.out.println("Enter the number :");
		for(i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0; i<n; i++)
		{
			System.out.print(arr[i] +"\t");
		}
		for(i=1; i<n; i++)
		{
			for(j=i; j<n; j++)
			{
				t=arr[j];
				arr[j]=arr[i];
				arr[i]=t;
			}
			for(i=1; i<n; i++)
			{
				System.out.print(arr[i] +"\t");
			}
		}
	}

}