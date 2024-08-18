import java.util.*;

class constr
{
	public static void main(String []args)
	{
		StringBuffer sb = new StringBuffer("VARUN");
		
		sb.append(" LIG");
		
		sb.insert(2,  "V");
		
		
		String str = sb.toString();
		System.out.println(sb);
	}
}