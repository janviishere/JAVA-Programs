import java.util.Scanner;

// Define an interface with multiple methods for mathematical operations
interface MathOperations {
    void add();
    void subtract();
    void multiply();
    void divide();
}

// Implement the interface in a class
public class Calculator implements MathOperations {
    private double num1;
    private double num2;
    
    public Calculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: \n");
        num1 = scanner.nextDouble();
        System.out.print("Enter second number: \n");
        num2 = scanner.nextDouble();
        scanner.close();
    }
    
    // Implement the add method
    public void add() {
        System.out.println("Addition: " + (num1 + num2));
    }
    
    // Implement the subtract method
    public void subtract() {
        System.out.println("Subtraction: " + (num1 - num2));
    }
    
    // Implement the multiply method
    public void multiply() {
        System.out.println("Multiplication: " + (num1 * num2));
    }
    
    // Implement the divide method with validation to avoid division by zero
    public void divide() {
        if (num2 == 0) {
            System.out.println("Error: Division by zero is not allowed. Please provide a non-zero divisor.");
        } else {
            System.out.println("Division: " + (num1 / num2));
        }
    }
    
    public static void main(String[] args) {
        // Create an instance of the Calculator class
        Calculator calc = new Calculator();
        
        // Perform the math operations
        calc.add();
        calc.subtract();
        calc.multiply();
        calc.divide();
    }
}