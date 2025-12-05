import java.util.Scanner;

public class HelloWorlddd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the word: \n");
        String input = scanner.nextLine();
        
        // Check input case-insensitive
        if (input.equalsIgnoreCase("moodle")) {
            printHelloWorld();  // Call the method if input is correct
        } else {
            System.out.println("Incorrect input. Please enter 'moodle'.");
        }
        
        scanner.close();
    }
    
    // Simple method to print "Hello, World!"
    public static void printHelloWorld() {
        System.out.println("Hello, World!");
    }
}
