import java.util.*;

class strbuff
{
	public static void main(String []args)
	{
		//cons1
		StringBuffer str1 = new StringBuffer();
		System.out.println(str1.capacity());
		str1.append("We Make Cookies");
		str1.append(" very good");
		String str = str1.toString();
		System.out.println(str1);
	}
}