import java.util.*;

class revstr
{
		public static void main(String []args)
		{
			 Scanner sc = new Scanner(System.in);

			System.out.print("Enter the string to reverse: ");
			String str = sc.nextLine();

			int i,a;
			//String str="Varun Sinha";
			String rstr=" ";
			char ch;
			
			for(i=0;i<str.length();i++)
			{
				ch=str.charAt(i);
				rstr=ch+rstr;
				
			}
			System.out.println("Reverse String :" +rstr);
			a=str.length();
			System.out.println("Reverse String :" +a);
		}


}    