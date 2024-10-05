import java.util.*;

class thkey
{
	int rollno;
	String name;
	float fee;
	
thkey(int rollno,String name, float fee)
{
	this.rollno = rollno;
	this.name = name;
	this.fee = fee;
}
void display()
{
	System.out.println(rollno+" "+name+" "+fee);
}
}

class test
{
	public static void main(String []args)
	{
		thkey  t1 = new thkey(333,"Varun",5000f);
		thkey  t2 = new thkey(334,"Vishakha",6000f);
		t1.display();
		t2.display();
	}
	
		
}