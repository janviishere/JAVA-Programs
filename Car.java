import java.util.Scanner;

public class Car {
    private String make;
    private String model;
    private int year;

    // TODO: Implement the default constructor
    public Car() {
        this.make = "Unknown";
        this.model = "Unknown";
        this.year = 0;
    }

    // TODO: Implement the parameterized constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method to display car details
    public void printDetails() {
        System.out.println("Car Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car defaultCar = new Car();  // Default constructor
        
        // Get user input for parameterized constructor
        System.out.print("Enter car make: \n");
        String makeInput = scanner.nextLine();
        
        System.out.print("Enter car model: \n");
        String modelInput = scanner.nextLine();
        
        // Handle InputMismatchException for year input
        int yearInput = 0;
        boolean validInput = false;
        do {
            System.out.print("Enter car year: \n");
            if (scanner.hasNextInt()) {
                yearInput = scanner.nextInt();
                validInput = true;
            } else {
                System.out.println("Invalid input! Please enter a valid year (integer).");
                scanner.nextLine(); // Clear invalid input [web:41]
            }
        } while (!validInput);
        
        Car userCar = new Car(makeInput, modelInput, yearInput);

        // Print details
        System.out.println("\nDefault Car:");
        defaultCar.printDetails();

        System.out.println("\nUser-Defined Car:");
        userCar.printDetails();

        scanner.close();
    }
}