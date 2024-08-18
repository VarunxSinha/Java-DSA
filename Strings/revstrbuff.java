import java.util.*;

class revstrbuff
{
	public static void main(String []args)
	{
		StringBuffer sb3= new StringBuffer(20);
		
		sb3.append("Varunis a ios devl");
		//sb3.replace(1, 5, "Sinha");
		sb3.reverse();
		
		
		String str = sb3.toString();
		System.out.println(sb3);
	}
}