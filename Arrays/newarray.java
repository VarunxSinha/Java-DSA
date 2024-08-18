importjava.util*;
class string1
{								
	public static void main(String []args)
	{
		String str;
		Scanner sr=new Scanner(System.in);
		System.out.println("Enter the string :");
		str=sr.nextLine();
		System.out.println("string="+str);
		l=str.length();
		System.out.println("length of thr string:"+l);
		
		for(i=0; i<l; i++)
		{
			System.out.println(str.charAt(i));
		}
		for(i=l-1; i>0; i--)
		{
			System.out.println(str.charAt(i));
		}
		
	}
}