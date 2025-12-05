import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the dimensions of the first matrix
        System.out.print("Enter the number of rows for the first matrix: \n");
        int r1 = scanner.nextInt();
        System.out.print("Enter the number of columns for the first matrix: \n");
        int c1 = scanner.nextInt();
        
        // Prompt the user to enter the dimensions of the second matrix
        System.out.print("Enter the number of rows for the second matrix: \n");
        int r2 = scanner.nextInt();
        System.out.print("Enter the number of columns for the second matrix: \n");
        int c2 = scanner.nextInt();
        
        // Check for valid dimensions
        if (r1 <= 0 || c1 <= 0 || r2 <= 0 || c2 <= 0) {
            System.out.println("Error: Matrix dimensions must be positive integers.\n");
            scanner.close();
            return;
        }
        
        if (c1 != r2) {
            System.out.println("Error: The number of columns of the first matrix must equal the number of rows of the second matrix.\n");
            scanner.close();
            return;
        }
        
        // Initialize the matrices
        int[][] matrix1 = new int[r1][c1];
        int[][] matrix2 = new int[r2][c2];
        int[][] product = new int[r1][c2];
        
        // Input elements for the first matrix
        System.out.println("Enter elements of the first matrix:");
        int i = 0;
        while (i < r1) {
            int j = 0;
            while (j < c1) {
                System.out.print("Element [" + i + "][" + j + "]: \n");
                matrix1[i][j] = scanner.nextInt();
                j++;
            }
            i++;
        }
        
        // Input elements for the second matrix
        System.out.println("Enter elements of the second matrix:");
        i = 0;
        while (i < r2) {
            int j = 0;
            while (j < c2) {
                System.out.print("Element [" + i + "][" + j + "]: \n");
                matrix2[i][j] = scanner.nextInt();
                j++;
            }
            i++;
        }
        
        // Perform matrix multiplication
        i = 0;
        while (i < r1) {
            int j = 0;
            while (j < c2) {
                int k = 0;
                int sum = 0;
                while (k < c1) {
                    sum += matrix1[i][k] * matrix2[k][j];
                    k++;
                }
                product[i][j] = sum;
                j++;
            }
            i++;
        }
        
        // Display the product matrix
        System.out.println("Product of the matrices:");
        i = 0;
        while (i < r1) {
            int j = 0;
            while (j < c2) {
                System.out.print(product[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
        
        // Close the scanner
        scanner.close();
    }
}