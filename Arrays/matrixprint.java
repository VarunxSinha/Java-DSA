import java.util.*;

class matrixprint
{
	public static void main(String []args)
	{
		int arr[][] = new int[3][3];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Array Elements :");
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.print("Matrix: \n");
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
}