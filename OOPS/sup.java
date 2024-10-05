import java.util.*;

class Tyre 
{
    void moves() 
	{
        System.out.println("Tyre moves");
    }
}

class Vehicle 
{
    void speed() 
	{
        System.out.println("Vehicle is speeding up");
    }
}

class Car extends Vehicle 
{
    Tyre tyre = new Tyre();

    @Override
    void speed() 
	{
        super.speed();
        System.out.println("Car is speeding up");
    }

    void moveTyre() 
	{
        tyre.moves();
    }
}

class Main 
{
    public static void main(String[] args) 
	{
        Car car = new Car();
        car.speed(); 
        car.moveTyre(); 
    }
}
