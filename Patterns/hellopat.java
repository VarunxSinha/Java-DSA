import java.util.Scanner;

class hellopat {
    public static void main(String[] args) {
        String n;
        int j, i, l, k;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        n = sc.nextLine();
        
        int len = n.length();
        
        for (i=0; i<len;i++) 
		{
            for (j=0; j<len-i;j++) 
			{
                System.out.print(n.charAt(j) + " ");
            }
            
            for (k=0; k<2*i-1;k++) 
			{
                System.out.print("  ");
            }
         
            for (l=len-i-1; l>=0; l--) 
			.              if (l!=len-i-1||i==0)
                    System.out.print(n.charAt(l) + " ");
            }
            System.out.println();
        }
    }
}
