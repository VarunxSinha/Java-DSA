import java.util.*;

class whileloops
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		boolean hasLearnt = false;
		
		while(!hasLearnt)
		{
			System.out.println("went to class, tried to learn");
			System.out.println("have you understood?");
			hasLearnt = sc.nextBoolean();
		}
		
	}
}