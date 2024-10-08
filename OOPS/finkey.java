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
   
    final String species = "Vulture";
    
    public void eat() 
	{
        System.out.println(species + " is eating...");
    }
    
    public void sleep() 
	{
        System.out.println(species + " is sleeping!");
    }
    
    public void ill() 
	{
        System.out.println(species + " is ill");
    }
    
    public void fine() 
	{
        System.out.println(species + " is fine");
    }
}

class Main 
{
    public static void main(String[] args) 
	{
        final AnimalVulture ani = new AnimalVulture(); 
        
        ani.eat();
        ani.sleep();
        
        ani.ill();
        ani.fine();
        
       
        // ani = new AnimalVulture();  
    }
}
