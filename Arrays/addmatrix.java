import java.util.*;

class addmatrix
{
	public static void main(String []args)
	{
		int arr1[][] = new int[2][2];
		int arr2[][] = new int[2][2];
		int sum[][] = new int[2][2];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements of 1st matrix :");
		
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<2; j++)
			{
				arr1[i][j] = sc.nextInt();
			}
		
		}
		
		System.out.println("Enter the elements of 2nd matrix :");
		
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<2; j++)
			{
				arr2[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("First Matrix: \n");
		
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<2; j++)
			{
				System.out.print(arr1[i][j]+" ");
			}
			System.out.print("\n");
		}
		
		System.out.print("Second Matrix: \n");
		
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<2; j++)
			{
				System.out.print(arr2[i][j]+" ");
			}
			System.out.print("\n");
		}
		
		System.out.print("Sum of two matrixs: \n");
		
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<2; j++)
			{
			   sum[i][j] = arr1[i][j]+arr2[i][j];
			   System.out.print(sum[i][j]+" ");
			}
			System.out.print("\n");
		}
		
	}
}