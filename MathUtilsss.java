import java.util.Scanner;

public class MathUtilsss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number:\n");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number:\n");
        double num2 = scanner.nextDouble();

        double addition = add(num1, num2);
        double subtraction = subtract(num1, num2);
        double multiplication = multiply(num1, num2);
        double division = divide(num1, num2);

        System.out.println("Addition: " + num1 + " + " + num2 + " = " + addition);
        System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + subtraction);
        System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + multiplication);

        if (num2 == 0) {
            System.out.println("Division: Error: Division by zero!");
        } else {
            System.out.println("Division: " + num1 + " / " + num2 + " = " + division);
        }

        scanner.close();
    }

    public static double add(double a, double b) { return a + b; }
    public static double subtract(double a, double b) { return a - b; }
    public static double multiply(double a, double b) { return a * b; }
    public static double divide(double a, double b) { return (b == 0) ? 0 : (a / b); }
}
