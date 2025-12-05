import java.util.*;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Distance Converter!");
        System.out.println("Choose an option:");
        System.out.println("1. Convert Kilometers to Miles");
        System.out.println("2. Convert Miles to Kilometers");

        System.out.println("Enter your choice (1 or 2):");
        int choice = sc.nextInt();

        if(choice == 1) {
            System.out.println("Enter distance in kilometers:");
            double km = sc.nextDouble();

            if(km < 0) {
                System.out.println("Distance cannot be negative. Please restart the program.");
                return;
            }

            double miles = km * 0.621371;
            System.out.println("Distance in miles: " + miles);
        }
        else if(choice == 2) {
            System.out.println("Enter distance in miles:");
            double miles = sc.nextDouble();

            if(miles < 0) {
                System.out.println("Distance cannot be negative. Please restart the program.");
                return;
            }

            double km = miles / 0.621371;
            System.out.println("Distance in kilometers: " + km);
        }
        else {
            System.out.println("Invalid choice");
        }
    }
}
