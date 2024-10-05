import java.util.*;

class Student 
{
    int id;
    String name;

    Student(int id, String name) 
	{
        this.id = id;
        this.name = name;
    }

    void display() 
	{
        System.out.println("Student ID: " + this.id);
        System.out.println("Student Name: " + this.name);
    }

    public static void main(String[] args) 
	{
        
        Student student1 = new Student(101, "Vavish");

   
        student1.display();
    }
}
