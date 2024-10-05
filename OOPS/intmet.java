import java.util.*;

interface Animal 
{
    void sound(); 
    void eat();   
}


interface Vehicle 
{
    void start(); 
    void stop();  
}

class MainClass 
{
           public void sound() 
			{
                System.out.println("The animal makes a sound.");
            }
            public void eat() 
			{
                System.out.println("The animal is eating.");
            }
           public void start() 
			{
                System.out.println("The vehicle starts.");
            }
           public void stop() 
			{
                System.out.println("The vehicle stops.");
            }
        public static void main(String[] args) 
        Animal animal = new Animal() 
		{
     
        animal.sound();
        animal.eat();

        vehicle.start();
        vehicle.stop();
    }
}
