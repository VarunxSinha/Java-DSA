import java.util.*;

//Finl keyword 3 ways 

//Variable - once declared as a final cannot be reassigned
//should be in upper case

//Variable prog
// class finkey
// {
	// public static void main(String []args)
	// {
	// final int A = 10;
	// System.out.println(A);
	
	// A=13;//no reassignment
	// System.out.println(A);
	
	// }
	
// }

//Final Method - when we declare a method as a final it cant be overridden to our extended
//class

// class test
// {
	// void mobnum()
	// {
		// System.out.println("1234546578");
	// }
	
	// final void atmPin()// cannot override this final 
	// {
		// System.out.println("2223");
	// }
// }

// class thief extends test
// {
	// void mobnum()
	// {
		// System.out.println("1234546578");
	// }
	
	// void atmPin()
	// {
		// System.out.println("2223");
	// }
// }

// class Final
// {
	// public static void main(String[]args)
	// {
		// thief t = new thief();
		// t.mobnum();
		// t.atmPin();
	// }
// }

//final class - when we declarea an class as final it cannot be extended 
//or inherited to sub classes

final class A
{
	void upiPin()
	{
		System.out.println("243233");
	}
}

class thiefs extends A
{
	void upiPin()
	{
		System.out.println("243233");
	}
}

class testing
{
	public static void main(String []args)
	{
		thiefs t1 = new thiefs();
		t1.upiPin();
	}
}