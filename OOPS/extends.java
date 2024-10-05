import java.util.*;

interface Animal
{
    void eat();
    void sleep();
}

interface Vulture extends Animal 
{  
    void ill();
    void fine();
}

class AnimalVulture implements Vulture 
{ 
    public void eat() 
	{
        System.out.println("Animal is eating...");
    }
    
    public void sleep() 
	{
        System.out.println("Animal is sleeping!");
    }
    
    public void ill() 
	{
        System.out.println("Vulture is ill.");
    }
    
    public void fine() 
	{
        System.out.println("Vulture is fine.");
    }
}

class Main 
{  
    public static void main(String []args) 
	{
        AnimalVulture ani = new AnimalVulture();  
        
        ani.eat();
        ani.sleep();
        
        ani.ill();
        ani.fine();
    }
}
