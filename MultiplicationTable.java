import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the maximum value for the multiplication table: \n");
        int max = scanner.nextInt();
        
        if (max <= 0) {
            System.out.println("Error: Please enter a positive number greater than zero.");
        } else {
            for (int i = 1; i <= max; i++) {
                for (int j = 1; j <= max; j++) {
                    System.out.print(i * j + "  ");
                }
                System.out.println(); 
            }
        }
        
        scanner.close();
    }
}