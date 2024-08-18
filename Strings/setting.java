import java.util.*;

class setting
{
	public static void main(String []args)
	{
		StringBuffer sb4= new StringBuffer(20);
		
		sb4.append("Varunis a ios devl");
		sb4.setCharAt(0, 'p');
		
		
		String str = sb4.toString();
		System.out.println(sb4);
	}
}