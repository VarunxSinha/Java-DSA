import java.util.*;

abstract class bike
{
	bike()
	{
		System.out.println("bike is created");
	}
	
	abstract void run(); 
	
	void changeGear()
	{
		System.out.println("Gear Changed!");
	}
}

class Honda extends bike
{
	void run()
	{
		System.out.println("running safely...");
	}
}

class Test
{
	public static void main(String[] args)
	{
		bike obj = new Honda(); 
		obj.run();
		obj.changeGear();
	}
}
