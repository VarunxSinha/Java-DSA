import java.util.*;

class cons{
	int su,sum=0,n,i;
	//String name;
   
	cons() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		n=sc.nextInt();
		
		for(i=0; i<=n; i++)
		{
			sum=sum+2*i;
		}
		System.out.println("Sum of even num is="+sum);
    }
	cons(int s)
	{
		sum=s;
	}
	void input()
	{
		for(i=0,su=0; i<=sum; i++)
		{
			su=su+2*i;
		}
		System.out.println("Sum of even num is="+su);
	}
}
class new1
{
    public static void main(String[] args) 
	{
        
        cons p = new cons();
		cons p1 = new cons(5);
		p1.input();
    }
}

	