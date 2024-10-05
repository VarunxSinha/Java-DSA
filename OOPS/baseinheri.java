import java.util.*;

class Employee 
{  
    float salary = 40000;  
}  

class Programmer extends Employee 
{  
    int bonus = 10000; 
}

//Single inheritance
class Animal
{
	void eat()
	{
		System.out.println("Eating"); 
	}
}
class Dog extends Animal
{
	void bark()
	{
	    System.out.println("Barking"); 
	}
	
}

//Multilevel
class BabyDog extends Dog
{
	void weep()
	{
		System.out.println("Weeping");
	}
}

//Hierarchical
class Cat extends Dog
{
	void meow()
	{
		System.out.println("Meowing");
	}
}
class baseinheri 
{  
    public static void main(String args[]) 
	{  
        Programmer p = new Programmer();  
        System.out.println("Programmer salary is: " + p.salary);  
        System.out.println("Bonus of Programmer is: " + p.bonus);  
		
		//single
		Dog e = new Dog();
		e.bark();
		e.eat();
		
		//multilevel
		BabyDog q = new BabyDog();
		q.weep();
		
		//hierarchical
		Cat w = new Cat();
		w.meow();
    }  
}
