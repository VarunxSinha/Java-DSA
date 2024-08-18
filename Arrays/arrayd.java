import java.util.Scanner;

class arrayd {
    public static void main(String[] args) {
        int[][] array = new int[20][20];
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        if (rows != cols) {
            System.out.println("The number of rows and columns must be the same to print the diagonals.");
            return;
        }

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter value for element at row " + (i + 1) + ", column " + (j + 1) + ": ");
                array[i][j] = sc.nextInt();
            }
        }

        System.out.println("The 2D array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Diagonal elements are:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == j || (i + j) == (rows - 1)) {
                    System.out.print(array[i][j] + " ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }

    }
}
