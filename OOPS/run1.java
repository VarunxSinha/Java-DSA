import java.util.*;

class runtpoly
{
	void area()
	{
		System.out.println("This is area part");
	}
}

class yolo extends runtpoly
{
	void area()
	{
		System.out.println("This area part 2");
	}
}

class run1
{
	public static void main(String []args)
	{
		yolo y = new yolo();
		y.area();
	}
}