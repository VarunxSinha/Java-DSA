import java.util.*;
class string1
{								
	public static void main(String []args)
	{
		int i,l,e,j;
		String str, str1;
		Scanner sr=new Scanner(System.in);
		System.out.println("Enter the string :");
		str=sr.nextLine();
		System.out.println("string="+str);
		l=str.length();
		System.out.println("length of thr string:"+l);
		
		for(i=0; i<l; i++)
		{
			System.out.print(str.charAt(i));
		}
		System.out.println("");
		
		
		System.out.println("Enter the second string :");
		str1=sr.nextLine();
		System.out.println("string="+str1);
		e=str1.length();
		System.out.println("length of thr string:"+e);
		
		for(i=0; i<l; i++)
		{
			System.out.print(str.charAt(i));
		}
		System.out.println("");
		if(l==e)
		{
			for(i=0; i<l; i++)
			{
				for(j=0; j<l; j++)
				{
					if((str.charAt(i))==(str1.charAt(j)))
					{
						
					}
				}
			}
			System.out.println("its same");
		}
		else
		{
			System.out.println("not same");
		}
		
	}
}