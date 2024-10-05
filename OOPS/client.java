import java.util.*;

//collections of abstract method
//to achieve ineterface in java impleements is used
//interfaces are default public
//deals with client and developer

interface client
{
	void input();
	void output();
}

class dev implements client
{
	String name;
	double sal;
	
	public void input()
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the username :");
		name = sc.nextLine();
		
		System.out.println("Enter Salary :");
		sal = sc.nextDouble();
	}
	
	public void output()
	{
		System.out.println(name+" "+sal);
	}
	public static void main(String []args)
	{
		client c = new dev();
		c.input();
		c.output();
	}
}