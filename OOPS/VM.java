import java.util.*;

interface Vehicle
{
	void start();
	void stop();
}

interface Machine
{
	void turnon();
	void turnoff();
}

class c implements Vehicle, Machine
{
	public void start()
	{
		System.out.println("Car is starting...");
	}
	
	public void stop()
	{
		System.out.println("Car is stopping!");
	}
	
	public void turnon()
	{
		System.out.println("Car engine is turning on");
	}
	
	public void turnoff()
	{
		System.out.println("Car engine turning off");
	}
}

class main
{
	public static void main(String []args)
	{
		c car=new c();
		
		car.start();
		car.stop();
		
		car.turnon();
		car.turnoff();
		
	}
}