import java.util.Scanner;

public class FibonacciSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of Fibonacci numbers to generate: \n");
        int n = scanner.nextInt();
        if (n < 1 || n > 50) {
            System.out.println("Please enter a positive integer.");
            scanner.close();
            return;
        }

        long[] fib = new long[n];
        
        // Generate Fibonacci numbers using for loop
        fib[0] = 0;
        if (n > 1) fib[1] = 1;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        // Print generated Fibonacci numbers
        System.out.println("Generated Fibonacci numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] + " ");
        }
        System.out.println();

        System.out.print("Enter the Fibonacci number to search for: \n");
        long x = scanner.nextLong();

        // Search for x in fib array using a method
        int index = searchFib(fib, x);
        if (index >= 0) {
            System.out.println("The Fibonacci number " + x + " is found at index " + index);
        } else {
            System.out.println("The Fibonacci number " + x + " is not in the array.");
        }

        scanner.close();
    }

    // Method to search for Fibonacci number in the array
    public static int searchFib(long[] fib, long x) {
        for (int i = 0; i < fib.length; i++) {
            if (fib[i] == x) {
                return i;
            }
        }
        return -1;
    }
}