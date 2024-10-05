//POLYMORPHISM//

//act of representing a thing in multiple ways.
// types of poly-:
// 01) compile or static poly - achived via a method overloading
// 02) run time/dynamic poly -  achived via a method overriding

//METHOD OVERLOADING:-
// when a class has multiple methods with the same name but types, arguemnts, returns types
// ordering can be diff.

//OVERRIDING
// when a class has same name and perform diff or specific function is 
//overriding

//eg  - multiple constructors


//compile time
import java.util.*;

class compoly
{
	int sum(int a, int b)
	{
		int s=a+b;
		return s;
	}
	
	int sum(int a, int b, int c)
	{
		int s=a+b+c;
		return s;
	}
	
	public static void main(String []args)
	{
		compoly obj = new compoly();
		
		System.out.println(obj.sum(2,3));
		System.out.println(obj.sum(3,2,1));
	}
	
}
