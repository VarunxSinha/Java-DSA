import java.util.*;

class palindrome
{
	public static void main(String []args)
	{
		String s;
		int i,n=5;
		Scanner sc = new Scanner(System.in);
		// System.out.println("How many string :");
		// s=sc.nextLine();
		System.out.println("Enter the String :");
		s=sc.nextLine();
		
		if(s==null || s.length()==0)
		{
			System.out.println("Its a palindrome");
		}
		
		s=s.toLowerCase();
		boolean isPalindrome=true;
		
		for(i=0; i<=s.length()/2; i++)
		{
			char first = s.charAt(i);
			char last = s.charAt(s.length() - 1 - i);
			
			if(first!=last)
			{
				isPalindrome=false;
				break;
			}
		}
		if(isPalindrome)
		{
			System.out.println("it is a palindrome");
		}
		else
		{
			System.out.println("it is not a palindrome");
		}
	}
}