import java.util.Scanner;

 class arrayd
 {  
	
	public static void main(String[] args) {
		int arr[][]=new int[20][20];
        Scanner scanner = new Scanner(System.in);        
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();
  
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter value for element at row " + (i+1) + ", column " + (j+1) + ": ");
                array[i][j] = scanner.nextInt();
            }
        }

        
        System.out.println("The 2D array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
