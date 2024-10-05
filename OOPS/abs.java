import java.util.*;

abstract class parent
{
	abstract void career();
	abstract void partner();
	void finance()
	{
		System.out.println("finances of the couple");
	}
}

class Son extends parent
{
	void career()
	{
		System.out.println("I am going to be a officer");
	}
	
	void partner()
	{
		System.out.println("I am going to marry a doctor");
	}
	
	// void finance()
	// {
		// System.out.println("I am financially stable");
	// }
}
class Daughter extends parent
{
	void career()
	{
		System.out.println("I am going to become a doctor");
	}
	
	void partner()
	{
		System.out.println("I love iron man");
	}
	
	// void finance()
	// {
		// System.out.println("I am not financially stable");
	// }
}

class main
{
	public static void main(String []args)
	{
		Son son = new Son();
		// son.career();
		son.finance();
		
		Daughter daughter = new Daughter();
		// daughter.career();
		daughter.finance();
	}
	
}