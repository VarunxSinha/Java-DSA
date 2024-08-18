import java.util.*;


class stu {
    String name;
    int age;

   
    void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        name = scanner.nextLine();

        System.out.print("Enter age: ");
        age = scanner.nextInt();
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Main {
    public static void main(String[] args) {
        
        stu student1 = new stu();
        
       
        student1.input();

      
        student1.display();
    }
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
