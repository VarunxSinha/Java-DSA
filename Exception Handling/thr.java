import java.util.*;

class test
{
	void div(int a, int b) throws ArthematicException
	{
		if(b==0)
		{
			throw new ArthematicException();
		}
		else
		{
			int c=a/b;
			System.out.println(c);
		}
	}
	
	public static void main(String[]args)
	{
		test t=new test();
		try
		{
		t.div(20,0);
		}
		catch(Exceptipon e)
		{
			System.out.println("The Value of b is zero");
		}
	}
} 