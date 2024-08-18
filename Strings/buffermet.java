import java.util.*;

class buffermet
{
	public static void main(String []args)
	{
		StringBuffer sb2 = new StringBuffer(20);
		System.out.println(sb2.capacity());
		sb2.append("Varunis a is a developer");
		//sb2.replace(1, 5, "Sinha");
	    sb2.delete(1, 5);
		
		String str = sb2.toString();
		System.out.println(sb2);
	}
}