import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the percentage of marks
        System.out.print("Enter the percentage of marks: \n");
        double percentage = scanner.nextDouble(); // Take input from the user
        
        // Cast percentage to an integer category for the switch
        int gradeCategory = (int) (percentage / 10);
        
        // Determine the grade based on the percentage using switch statement
        switch (gradeCategory) {
            case 10: // covers 100%
            case 9:
                System.out.println("The grade is: A");
                break;
            case 8:
                System.out.println("The grade is: B");
                break;
            case 7:
                System.out.println("The grade is: C");
                break;
            case 6:
                System.out.println("The grade is: D");
                break;
            default:
                if (percentage < 0 || percentage > 100) {
                    System.out.println("Invalid percentage entered.");
                } else {
                    System.out.println("The grade is: F");
                }
                break;
        }
        
        // Close the scanner
        scanner.close();
        
    }
}