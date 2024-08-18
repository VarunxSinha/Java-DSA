import java.util.*;

class combine
{

	public static void main(String []args)
	{
		int number1,number2,sum,diff,prod,div; 

		Scanner sr=new Scanner(System.in);
		System.out.println("Enter Num 1:");
		number1=sr.nextInt();

		System.out.println("Enter Num 2:");
		number2=sr.nextInt();

		sum=number1+number2;
		diff=number1-number2;
		prod=number1*number2;
		div=number1/number2;
		
		System.out.println("Sum:"+sum);
		System.out.println("Difference:"+diff);
		System.out.println("Product:"+prod);
		System.out.println("Division:"+div);
				

	} 

}