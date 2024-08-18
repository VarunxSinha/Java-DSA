import java.util.*;

class bufflen
{
	public static void main(String []args)
	{
		StringBuffer sb5= new StringBuffer(20);
		
		sb5.append("Varunis a ios devl");
		sb5.setLength(6);
		
		
		String str = sb5.toString();
		System.out.println(sb5);
	}
}