import java.util.*;
class sort
{
	public static void main(String 	args[])
	{
		Scanner sr = new Scanner(System.in);
		String str[]=new String[10];
		int n,i;
		System.out.println("How many String: ");
		n=sr.nextInt();
		System.out.print("Enter the string: ");
		for(i=0;i<n;i++)
		{
			str[i]=sr.nextLine();
		}
		for(i=0;i<n;i++)
		{
			System.out.println(str[i]);
		}
	}
}

