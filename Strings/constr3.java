import java.util.*;

class constr3
{
	public static void main(String []args)
	{
		StringBuffer sb1 = new StringBuffer(20);
		
		sb1.append("Varunis a ios devl");
		sb1.replace(1, 5, "Sinha");
		
		
		String str = sb1.toString();
		System.out.println(sb1);
	}
}