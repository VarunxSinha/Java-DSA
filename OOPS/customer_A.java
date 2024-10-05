import java.util.*;

interface customer_A//requirements
{
	int amt = 5; //public static final
	void purchase();
}

class seller implements customer_A//provider
{
	public void purchase()
	{
	    //amt=5 final
		System.out.println("Customer needs" +amt+" Kg rice");
	}
}

class Check
{
	public static void main(String []args)
	{
		customer_A c = new seller();
		c.purchase();
		System.out.println(customer_A.amt) //static
	}
}
