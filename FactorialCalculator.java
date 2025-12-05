import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a number
        // Take input from the user
        System.out.print("Enter a number: \n");
        int n = scanner.nextInt();
        
        // Initialize variables
         // Variable to store the factorial
        // Start with the first multiplier
        long factorial = 1;
        int i = 1;
        
        do {
            factorial *= i;
            i++;
        } while (i <= n);
        
        // Use a do-while loop to calculate the factorial
       //Write your code here
        System.out.println("The factorial of " + n + " is: " + factorial);
        // Output the result

        // Close the scanner
        scanner.close();
    }
}