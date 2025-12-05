import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: \n");
            int num = scanner.nextInt();   // May cause InputMismatchException
            System.out.println("You entered: " + num);

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer.");

        } finally {
            scanner.close();
            System.out.println("Scanner closed.");
        }
    }
}
