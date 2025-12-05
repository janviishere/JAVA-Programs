import java.util.Scanner;

public class Fraction {
    private int numerator;
    private int denominator;

    // Constructor
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    // Method to get the greatest common divisor (GCD)
    private int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Method to simplify the fraction
    private void simplify() {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
        // ensure denominator positive
        if (denominator < 0) {
            denominator = -denominator;
            numerator = -numerator;
        }
    }

    // Add method
    public Fraction add(Fraction other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    // Subtract method
    public Fraction subtract(Fraction other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    // Multiply method
    public Fraction multiply(Fraction other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    // Divide method
    public Fraction divide(Fraction other) {
        if (other.numerator == 0) {
            return null; // Cannot divide by zero
        }
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new Fraction(newNumerator, newDenominator);
    }

    // String representation
    public String toString() {
        return numerator + "/" + denominator;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for first fraction
        System.out.print("Enter numerator for the first fraction: \n");
        int num1 = scanner.nextInt();

        System.out.print("Enter denominator for the first fraction (non-zero): \n");
        int den1 = scanner.nextInt();

        // Input for second fraction
        System.out.print("Enter numerator for the second fraction: \n");
        int num2 = scanner.nextInt();

        System.out.print("Enter denominator for the second fraction (non-zero): \n");
        int den2 = scanner.nextInt();

        // Create fraction objects
        Fraction f1 = new Fraction(num1, den1);
        Fraction f2 = new Fraction(num2, den2);

        // Perform operations
        Fraction sum = f1.add(f2);
        Fraction diff = f1.subtract(f2);
        Fraction prod = f1.multiply(f2);
        Fraction quot = f1.divide(f2);

        // Display results
        System.out.println("\nFirst Fraction: " + f1);
        System.out.println("Second Fraction: " + f2);
        System.out.println("Sum (Addition): " + sum);
        System.out.println("Difference (Subtraction): " + diff);
        System.out.println("Product (Multiplication): " + prod);
        if (quot != null) {
            System.out.println("Quotient (Division): " + quot);
        } else {
            System.out.println("Cannot divide by zero.");
        }

        // Close the scanner
        scanner.close();
    }
}