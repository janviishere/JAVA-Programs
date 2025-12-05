import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchFinally {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: \n");
            int num = scanner.nextInt();

            System.out.print("Enter a divisor: \n");
            int divisor = scanner.nextInt();

            int result = num / divisor;
            System.out.println("Result of division: " + result);

        } 
        catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer.");
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } 
        finally {
            scanner.close();
            System.out.println("Scanner closed. Resources released.");
        }
    }
}
